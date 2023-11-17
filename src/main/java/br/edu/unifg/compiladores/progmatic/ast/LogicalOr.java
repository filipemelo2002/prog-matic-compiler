package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class LogicalOr implements ASTNode{

    private final ASTNode left;

    private final ASTNode right;

    public LogicalOr(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
            return (Boolean) leftValue  || (Boolean) rightValue;
        }

        throw new RuntimeException("Invalid Logical OR operation. The elements must be boolean");
    }
}
