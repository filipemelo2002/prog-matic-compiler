package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class Constant implements ASTNode{


    private final Object value;
    public Constant (Object value) {
        this.value = value;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        return this.value;
    }
}
