package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;

public class VarDeclaration implements ASTNode{

    private final String type;
    private final String name;

    private final ASTNode expression;

    public VarDeclaration(String type, String name, ASTNode expression) {
        this.type = type;
        this.name = name;
        this.expression = expression;
    }
    public VarDeclaration(String type, String name) {
        this.type = type;
        this.name = name;
        expression = null;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (symbolTable.containsKey(this.name)) {
            throw new RuntimeException("Variable named \""+this.name+"\" already exists");
        }


        if (this.expression != null) {
            symbolTable.put(this.name, this.expression.execute(symbolTable));
            return null;
        }

        symbolTable.put(this.name, null);

        return null;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
