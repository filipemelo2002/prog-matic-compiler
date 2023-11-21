package br.edu.unifg.compiladores.progmatic.ast;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ProcedureCall implements ASTNode{

    private final String procedureName;
    private final List<ASTNode> arguments;

    public ProcedureCall(String procedureName, List<ASTNode> arguments) {
        this.procedureName = procedureName;
        this.arguments = arguments;
    }
    @Override
    public Object execute(Map<String, Object> symbolTable) {

        ProcedureDeclaration procedureDeclaration = (ProcedureDeclaration) symbolTable.get(this.procedureName);

        if (Objects.isNull(procedureDeclaration)) {
            throw new RuntimeException("Procedure named \""+this.procedureName+"\" was not found");
        }


        List<Parameter> parameters = procedureDeclaration.getParameters();
        if (
            (this.arguments == null && !parameters.isEmpty()) ||
            (Objects.requireNonNull(this.arguments).size() != parameters.size())
        ) {
            throw new RuntimeException("Invalid arguments when calling procedure \""+this.procedureName+"\"");
        }


        Map<String, Object> localSymbolTable = new HashMap<>(procedureDeclaration.getLocalSymbolTable());

        for (int index = 0; index < this.arguments.size(); index++) {
            Parameter param = (Parameter) parameters.get(index);
            ASTNode argument = this.arguments.get(index);
            localSymbolTable.put(param.getName(), argument.execute(symbolTable));
        }

        for (ASTNode node : procedureDeclaration.getBody()) {
            node.execute(localSymbolTable);
        }
        return null;
    }
}
