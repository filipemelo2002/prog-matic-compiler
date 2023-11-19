package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class VarAttribution implements ASTNode{

    private final String name;
    private final ASTNode value;

    public VarAttribution(String name, ASTNode value) {
        this.name = name;
        this.value = value;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (!symbolTable.containsKey(this.name)) {
            throw new RuntimeException("Cannot find variable named \"" + this.name+"\"");
        }


        symbolTable.put(this.name, value.execute(symbolTable));

        return null;
    }

    public String getName() {
        return name;
    }

    public ASTNode getValue() {
        return value;
    }
}
