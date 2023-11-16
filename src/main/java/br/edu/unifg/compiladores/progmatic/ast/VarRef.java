package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class VarRef implements ASTNode {

    private final String varName;

    public VarRef(String varName) {
        this.varName = varName;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (symbolTable.containsKey(varName)) {
            return symbolTable.get(varName);
        }

        throw new RuntimeException("Variable not found: "+ this.varName);
    }
}
