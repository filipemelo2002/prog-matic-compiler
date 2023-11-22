package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;
import java.util.Objects;

public class PointerAttribution implements ASTNode{

    private final String name;
    private final String variableIdentifier;

    public PointerAttribution(String name, String variableIdentifier) {
        this.name = name;
        this.variableIdentifier = variableIdentifier;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object pointerObj = symbolTable.get(this.name);

        if (Objects.isNull(pointerObj)) {
            throw new RuntimeException("Pointer named \""+this.name+"\" could not be found");
        }

        if (!(pointerObj instanceof PointerDeclaration pointer)) {
            throw new RuntimeException("Object named \""+this.name+"\" is not a Pointer instance");
        }

        if (!symbolTable.containsKey(this.variableIdentifier)) {
            throw new RuntimeException("Variable \"" + this.variableIdentifier +"\" could not be found");
        }

        pointer.setVariableIdentifier(this.variableIdentifier);

        symbolTable.put(this.name, pointer);
        return null;
    }
}
