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

attribution: IDENTIFIER ATTRIBUTION (logicalExpression | attributionValues) SEMICOLON;

pointerDeclaration: typeDeclaration POINTER IDENTIFIER '=' ADDRESS IDENTIFIER SEMICOLON;

procedureDeclaration: procedure IDENTIFIER LPAREN parameterList RPAREN  LBRACE (statements)* RBRACE;

procedureCall: IDENTIFIER '(' argumentList ')' SEMICOLON;

argumentList: (IDENTIFIER (COMMA IDENTIFIER)*)?;

typeDeclaration: 'int' | 'str' | 'char' | 'float' | 'boolean';

attributionValues:  STRING_LITERAL | CHAR_LITERAL | FLOAT_LITERAL | BOOLEAN_LITERAL;

ifDeclaration: 'if' LPAREN logicalExpression RPAREN LBRACE (statements)* RBRACE (elseDeclaration)*;

elseDeclaration: 'else' LBRACE (statements)* RBRACE;

loopDeclaraion: 'loop' LPAREN logicalExpression RPAREN LBRACE (statements)* RBRACE;

logicalExpression returns [ASTNode node]:
	  logicalOrExpression {$node = $logicalOrExpression.node;}
	| logicalAndExpression
	| LOGICAL_NOT logicalExpression
	;

logicalOrExpression returns [ASTNode node]:
    logicalAndExpression  {$node = $logicalAndExpression.node;}
    (LOGICAL_OR right=logicalAndExpression {$node = new LogicalOr($node, $right.node);})*;

logicalAndExpression returns [ASTNode node]:
    equalityExpression {$node = $equalityExpression.node;}
    (LOGICAL_AND right=equalityExpression {$node = new LogicalAnd($node, $right.node);})*;

equalityExpression returns [ASTNode node]:
    relationalExpression {$node = $relationalExpression.node;}
    (operator=(EQUAL | NOT_EQUAL) right=relationalExpression {$node = new EqualityExpression($node, $right.node, $operator.text);})*;

relationalExpression returns [ASTNode node]:
    additiveExpression {$node = $additiveExpression.node;}
    (operator=(LESS | GREATER | LESS_EQUAL | GREATER_EQUAL) right=additiveExpression {$node = new RelationalExpression($node, $right.node, $operator.text);})*;

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

logicalNotExpression returns [ASTNode node]:
    LOGICAL_NOT operand=primaryExpression {$node = new LogicalNot($operand.node);};


parameterList : (parameter (COMMA parameter)*)?;
parameter : typeDeclaration IDENTIFIER;

printStatement: print LPAREN (logicalExpression | attributionValues) RPAREN SEMICOLON;
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
