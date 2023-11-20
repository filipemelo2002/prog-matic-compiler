package br.edu.unifg.compiladores.progmatic.ast;

import java.util.List;
import java.util.Map;

public class ProcedureDeclaration implements ASTNode{

    private final String name;
    private final List<Parameter> parameters;
    private final List<ASTNode> body;
    private final Map<String, Object> localSymbolTable;


    public ProcedureDeclaration(String name, List<Parameter> parameters, List<ASTNode> body, Map<String, Object> localSymbolTable) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
        this.localSymbolTable = localSymbolTable;
    }


    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (symbolTable.containsKey(this.name)) {
            throw new RuntimeException("Variable or procedure with given name \"" + this.name + "\" already exists.");
        }

        symbolTable.put(this.name, this);
        return null;
    }

    public String getName() {
        return name;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public List<ASTNode> getBody() {
        return body;
    }

    public Map<String, Object> getLocalSymbolTable() {
        return localSymbolTable;
    }
}
