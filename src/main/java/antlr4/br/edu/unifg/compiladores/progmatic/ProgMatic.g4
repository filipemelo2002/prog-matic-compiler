grammar ProgMatic;

@parser::header{
    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
    import br.edu.unifg.compiladores.progmatic.ast.*;
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

logicalOrExpression returns [ASTNode node]: logicalAndExpression (LOGICAL_OR logicalAndExpression)*;

logicalAndExpression : equalityExpression (LOGICAL_AND equalityExpression)*;

equalityExpression : relationalExpression ((EQUAL | NOT_EQUAL) relationalExpression)*;

relationalExpression : additiveExpression ((LESS | GREATER | LESS_EQUAL | GREATER_EQUAL) additiveExpression)*;

additiveExpression returns [ASTNode node]:
    multiplicativeExpression {$node = $multiplicativeExpression.node;}
    (operator=(PLUS | MINUS) right = multiplicativeExpression {$node = new AdditiveExpression($node, $right.node, $operator.text);})*;

multiplicativeExpression returns [ASTNode node]:
    unaryExpression {$node = $unaryExpression.node;}
    (operator = (MULTIPLY | DIVIDE | MODULO) right = unaryExpression {$node = new MultiplicativeExpression($node, $right.node, $operator.text);})*;

unaryExpression returns [ASTNode node]:
            operator = (PLUS | MINUS) operand = unaryExpression {$node = new UnaryExpression($operator.text, $operand.node);}
               | primaryExpression {$node = $primaryExpression.node;};

primaryExpression returns [ASTNode node]:
    logicalNotExpression {$node = $logicalNotExpression.node;}
    | INTEGER_LITERAL {$node = new Constant(Integer.parseInt($INTEGER_LITERAL.text));}
    | BOOLEAN_LITERAL {$node = new Constant(Boolean.parseBoolean($BOOLEAN_LITERAL.text));}
    | CHAR_LITERAL {$node = new Constant($CHAR_LITERAL.text.charAt(1));}
    | STRING_LITERAL {$node = new Constant($STRING_LITERAL.text.substring(1, $STRING_LITERAL.text.length() - 1));}
    | FLOAT_LITERAL {$node = new Constant(Float.parseFloat($FLOAT_LITERAL.text));}
    | IDENTIFIER {$node = new VarRef($IDENTIFIER.text);}
    | LPAREN expr=logicalOrExpression RPAREN {$node = $expr.node;};

logicalNotExpression returns [ASTNode node]: LOGICAL_NOT primaryExpression;


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
