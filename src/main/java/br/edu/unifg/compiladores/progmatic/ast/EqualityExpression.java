package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class EqualityExpression implements ASTNode {

    private final ASTNode leftOperand;
    private final ASTNode rightOperand;
    private final String operator;

    public EqualityExpression(ASTNode leftOperand, ASTNode rightOperand, String operator) {
        super();
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        Object leftResult = leftOperand.execute(symbolTable);
        Object rightResult = rightOperand.execute(symbolTable);


        return switch (operator) {
            case "==" -> isEqual(leftResult, rightResult);
            case "!=" -> !isEqual(leftResult, rightResult);
            default -> throw new RuntimeException("Invalid equality operator: " + operator);
        };
    }

    private boolean isEqual(Object left, Object right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.equals(right);
    }

}