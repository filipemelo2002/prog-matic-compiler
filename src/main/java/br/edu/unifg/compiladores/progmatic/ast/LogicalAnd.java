package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class LogicalAnd implements ASTNode{

    private final ASTNode left;

    private final ASTNode right;

    public LogicalAnd(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
            return (Boolean) leftValue  && (Boolean) rightValue;
        }

        throw new RuntimeException("Invalid Logical AND operation. The elements must be boolean");
    }
}
