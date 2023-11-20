package br.edu.unifg.compiladores.progmatic.ast;

import java.util.List;
import java.util.Map;

public class IfExpression implements ASTNode{

    public final List<ASTNode> ifBody;
    public final List<ASTNode> elseBody;

    public final ASTNode expression;

    public IfExpression(List<ASTNode> ifBody, List<ASTNode> elseBody, ASTNode expression) {
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        boolean evaluatedExpression = (Boolean)  this.expression.execute(symbolTable);

        if (evaluatedExpression) {
            for (ASTNode s : this.ifBody) {
                s.execute(symbolTable);
            }
        } else {
            for (ASTNode s : this.elseBody) {
                s.execute(symbolTable);
            }
        }

        return null;
    }
}
