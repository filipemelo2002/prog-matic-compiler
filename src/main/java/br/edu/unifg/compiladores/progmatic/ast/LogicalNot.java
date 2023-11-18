package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class LogicalNot implements ASTNode {

    private final ASTNode operand;

    public LogicalNot(ASTNode operand) {
        this.operand = operand;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object result = operand.execute(symbolTable);

        if (result instanceof Boolean) {
            return !(Boolean) result;
        }

        throw new RuntimeException("Logical NOT operation can only be applied to boolean values.");
    }
}