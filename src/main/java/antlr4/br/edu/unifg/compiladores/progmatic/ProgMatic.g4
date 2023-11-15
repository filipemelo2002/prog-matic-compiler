grammar ProgMatic;

@parser::header{
    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
    import br.edu.unifg.compiladores.progmatic.ast*;
}

@parser::members {
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program:
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
        Map<String, Object> symbolTable = new HashMap<String, Object>();
    }
    (statements {body.add($statements.node);})* EOF
    {
        for (ASTNode n : body) {
            n.execute(symbolTable);
        }
    };

statements returns [ASTNode node]
    : variableDeclaration
    | pointerDeclaration
    | procedureDeclaration
    | procedureCall
    | attribution
    | ifDeclaration
    | loopDeclaraion
    | printStatement
    | inputStatement;

variableDeclaration: typeDeclaration IDENTIFIER SEMICOLON | typeDeclaration attribution;

attribution: IDENTIFIER ATTRIBUTION (expression | attributionValues) SEMICOLON;

pointerDeclaration: typeDeclaration POINTER IDENTIFIER '=' ADDRESS IDENTIFIER SEMICOLON;

procedureDeclaration: procedure IDENTIFIER LPAREN parameterList RPAREN  LBRACE (statements)* RBRACE;

procedureCall: IDENTIFIER '(' argumentList ')' SEMICOLON;

argumentList: (IDENTIFIER (COMMA IDENTIFIER)*)?;

typeDeclaration: 'int' | 'str' | 'char' | 'float' | 'boolean';

attributionValues:  STRING_LITERAL | CHAR_LITERAL | FLOAT_LITERAL | BOOLEAN_LITERAL;

ifDeclaration: 'if' LPAREN conditionalExpression RPAREN LBRACE (statements)* RBRACE (elseDeclaration)*;

elseDeclaration: 'else' LBRACE (statements)* RBRACE;

loopDeclaraion: 'loop' LPAREN conditionalExpression RPAREN LBRACE (statements)* RBRACE;

expression : logicalOrExpression;

conditionalExpression: logicalOrExpression ((EQUAL | NOT_EQUAL | GREATER | LESS | GREATER_EQUAL | LESS_EQUAL))*;

logicalOrExpression : logicalAndExpression (LOGICAL_OR logicalAndExpression)*;

logicalAndExpression : equalityExpression (LOGICAL_AND equalityExpression)*;

equalityExpression : relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*;

relationalExpression : additiveExpression ((LESS | GREATER | LESS_EQUAL | GREATER_EQUAL) additiveExpression)*;

additiveExpression returns [ASTNode node]:
    multiplicativeExpression {$node = $multiplicativeExpression.node;}
    ((PLUS | MINUS) right = multiplicativeExpression {$node = new AdditiveExpression($node, $right.node, $(PLUS | MINUS).text);})*;

multiplicativeExpression returns [ASTNode node]: unaryExpression ((MULTIPLY | DIVIDE | MODULO) unaryExpression)*;

unaryExpression : (PLUS | MINUS) unaryExpression
               | primaryExpression;

primaryExpression : logicalNotExpression
                | INTEGER_LITERAL
                | IDENTIFIER
                | LPAREN expression RPAREN;

logicalNotExpression : LOGICAL_NOT primaryExpression;


parameterList : (parameter (COMMA parameter)*)?;
parameter : typeDeclaration IDENTIFIER;

printStatement: print LPAREN (expression | attributionValues) RPAREN SEMICOLON;
inputStatement: read LPAREN IDENTIFIER RPAREN SEMICOLON;

INTEGER_LITERAL: [0-9]+;
STRING_LITERAL: '"' (~["\r\n])* '"';
CHAR_LITERAL: '\'' ~["\r\n'] '\'';
FLOAT_LITERAL: [0-9]+ '.' [0-9]+;
BOOLEAN_LITERAL: 'true' | 'false';
POINTER: '->';
ADDRESS: '$';
IDENTIFIER: [a-zA-Z]+ ([a-zA-Z]+ | INTEGER_LITERAL | '_')*;
SEMICOLON: ';';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
COMMA: ',';
ATTRIBUTION: '=';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MODULO : '%';
GREATER : '>';
LESS : '<';
EQUAL : '==';
NOT_EQUAL : '!=';
GREATER_EQUAL : '>=';
LESS_EQUAL : '<=';
LOGICAL_AND : '&&';
LOGICAL_OR : '||';
LOGICAL_NOT : '!';
print: 'print';
read:  'read';

procedure: 'func';

WS: [ \t\r\n]+ -> skip;
