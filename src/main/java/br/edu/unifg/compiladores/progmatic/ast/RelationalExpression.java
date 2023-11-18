package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class RelationalExpression implements ASTNode {

    private final ASTNode leftOperand;
    private final ASTNode rightOperand;
    private final String operator;

    public RelationalExpression(ASTNode leftOperand, ASTNode rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftResult = leftOperand.execute(symbolTable);
        Object rightResult = rightOperand.execute(symbolTable);


        return switch (operator) {
            case ">" -> isGreaterThan(leftResult, rightResult);
            case "<" -> isLessThan(leftResult, rightResult);
            case ">=" -> isGreaterOrEqual(leftResult, rightResult);
            case "<=" -> isLessOrEqual(leftResult, rightResult);
            default -> throw new RuntimeException("Invalid operator: " + operator);
        };
    }

    private boolean isGreaterThan(Object leftResult, Object rightResult) {
        return compare(leftResult, rightResult) > 0;
    }

    private boolean isLessThan(Object leftResult, Object rightResult) {
        return compare(leftResult, rightResult) < 0;
    }

    private boolean isGreaterOrEqual(Object leftResult, Object right) {
        return compare(leftResult, right) >= 0;
    }

    private boolean isLessOrEqual(Object leftResult, Object rightResult) {
        return compare(leftResult, rightResult) <= 0;
    }

    private int compare(Object leftResult, Object rightResult) {
        if (leftResult instanceof Comparable<?> && rightResult instanceof Comparable<?>) {
            return ((Comparable<Object>) leftResult).compareTo(rightResult);
        }

        return String.valueOf(leftResult).compareTo(String.valueOf(rightResult));
    }
}
