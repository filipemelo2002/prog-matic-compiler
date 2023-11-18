package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class PrintExpression implements ASTNode{

    private final ASTNode expression;


    public PrintExpression(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        System.out.println(expression.execute(symbolTable));
        return null;
    }
}
