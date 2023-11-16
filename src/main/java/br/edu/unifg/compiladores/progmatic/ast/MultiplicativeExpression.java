package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class MultiplicativeExpression implements ASTNode{

    private final ASTNode left;
    private final ASTNode right;
    private final String operator;

    public MultiplicativeExpression(ASTNode left, ASTNode right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = this.left.execute(symbolTable);
        Object rightValue = this.right.execute(symbolTable);


        if (leftValue instanceof Integer && rightValue instanceof Integer) {
            int leftInt = (int) leftValue;
            int rightInt = (int) rightValue;


            return switch(this.operator) {
                case "*" -> leftInt * rightInt;
                case "/" -> leftInt / rightInt;
                case "%" -> leftInt % rightInt;
                default -> throw new RuntimeException("Invalid operator: " + this.operator);
            };
        }


        if (leftValue instanceof Float || rightValue instanceof Float)  {

            float leftFloat = (leftValue instanceof Float) ? (float) leftValue : (float) (int) leftValue;
            float rightFloat = (rightValue instanceof Float) ? (float) rightValue : (float) (int) rightValue;

            return switch (this.operator) {
                case "*" -> leftFloat * rightFloat;
                case "/" -> leftFloat / rightFloat;
                case "%" -> leftFloat % rightFloat;
                default -> throw new RuntimeException("Invalid operator: " + this.operator);
            };

        }

        throw new RuntimeException("Invalid type for arithmetic operation: " + leftValue.getClass() + ", " + rightValue.getClass());
    }
}
