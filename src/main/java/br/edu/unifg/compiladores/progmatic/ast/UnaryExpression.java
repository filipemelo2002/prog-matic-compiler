package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class UnaryExpression implements ASTNode{

    private final String operator;
    private final ASTNode operand;

    public UnaryExpression(String operator, ASTNode operand) {
        this.operator = operator;
        this.operand = operand;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object operandValue = this.operand.execute(symbolTable);

        if (operandValue instanceof Integer) {

            int operandInt = (int) operandValue;

            return switch(this.operator) {
                case "+" -> operandInt;
                case "-" -> -operandInt;
                default -> throw new RuntimeException("Invalid unary operator: " + this.operand);
            };
        }

        if (operandValue instanceof Float) {
            float operandFloat = (float) operandValue;

            return switch(this.operator) {
                case "+" -> operandFloat;
                case "-" -> -operandFloat;
                default -> throw new RuntimeException("Invalid unary operator: " + this.operand);
            };
        }

        throw new RuntimeException("Invalid type for unary operation: "+ operandValue.getClass());
    }
}
