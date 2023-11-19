package br.edu.unifg.compiladores.progmatic.ast;

import java.util.List;
import java.util.Map;

public class Loop implements ASTNode{

    private final List<ASTNode> body;
    private final ASTNode expression;

    public Loop(ASTNode expression, List<ASTNode> body) {
        this.body = body;
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        while((boolean) this.expression.execute(symbolTable)) {
            for (ASTNode node: this.body) {
                node.execute(symbolTable);
            }
        }
        return null;
    }
}
