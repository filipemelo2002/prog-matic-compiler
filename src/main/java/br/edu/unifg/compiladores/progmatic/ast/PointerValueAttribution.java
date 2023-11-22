package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;
import java.util.Objects;

public class PointerValueAttribution implements ASTNode{

    private final String name;
    private final ASTNode value;

    public PointerValueAttribution(String name, ASTNode value) {
        this.name = name;
        this.value = value;
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

        if (Objects.isNull(pointer.getVariableIdentifier())) {
            throw new RuntimeException("Pointer named \""+this.name+"\" was not initialized");
        }

        String variableIdentifier = pointer.getVariableIdentifier();

        if (!symbolTable.containsKey(variableIdentifier)) {
            throw new RuntimeException("Variable \"" + variableIdentifier +"\" could not be found");
        }

        symbolTable.put(variableIdentifier, this.value.execute(symbolTable));

        return null;
    }
}
