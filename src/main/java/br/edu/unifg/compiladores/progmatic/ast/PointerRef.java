package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;
import java.util.Objects;

public class PointerRef implements ASTNode{

    private final String name;

    public PointerRef(String name) {
        this.name = name;
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

        String varAddress = pointer.getVariableIdentifier();

        if(!symbolTable.containsKey(varAddress)) {
            throw new RuntimeException("Variable \"" + varAddress +"\" could not be found");
        }

        return symbolTable.get(varAddress);
    }
}
