package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;
import java.util.Objects;

public class PointerDeclaration implements ASTNode{

    private final String name;
    private final String type;
    private String variableIdentifier;


    public PointerDeclaration(String type, String name) {
        this.name = name;
        this.type = type;
        this.variableIdentifier = null;
    }

    public PointerDeclaration(String type, String name, String variableIdentifier) {
        this.name = name;
        this.type = type;
        this.variableIdentifier = variableIdentifier;
    }


    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (!Objects.isNull(this.variableIdentifier) && !symbolTable.containsKey(this.variableIdentifier)) {
            throw new RuntimeException("Variable \"" + this.variableIdentifier +"\" could not be found");
        }

        if (symbolTable.containsKey(this.name)) {
            throw new RuntimeException("An object named \"" + this.variableIdentifier +"\" already exists");
        }

        symbolTable.put(this.name, this);
        return null;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVariableIdentifier() {
        return variableIdentifier;
    }

    public void setVariableIdentifier(String identifier) {
        this.variableIdentifier = identifier;
    }
}
