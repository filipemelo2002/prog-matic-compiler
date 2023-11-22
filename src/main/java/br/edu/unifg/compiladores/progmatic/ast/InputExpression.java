package br.edu.unifg.compiladores.progmatic.ast;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class InputExpression implements ASTNode{

    public final String name;

    public InputExpression(String name) {
        this.name = name;
    }


    @Override
    public Object execute(Map<String, Object> symbolTable) {
        if (!symbolTable.containsKey(this.name)) {
            throw new RuntimeException("Cannot find variable named \"" + this.name+"\"");
        }

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        Object variableInstance = symbolTable.get(this.name);

        if (variableInstance instanceof Integer) {
            symbolTable.put(this.name, Integer.parseInt(userInput));
            return null;
        }

        if (variableInstance instanceof Boolean) {
            symbolTable.put(this.name, Boolean.parseBoolean(userInput));
            return null;
        }


        if (variableInstance instanceof Float) {
            symbolTable.put(this.name, Float.parseFloat(userInput));
            return null;
        }

        if (Objects.isNull(variableInstance)) {
            symbolTable.put(this.name, this.convertUserInput(userInput).execute(symbolTable));
            return null;
        }

        if (variableInstance instanceof PointerDeclaration) {
            ASTNode value = this.convertUserInput(userInput);

            PointerValueAttribution attribution = new PointerValueAttribution(this.name, value);
            attribution.execute(symbolTable);
            return null;
        }

        throw new RuntimeException("Could not read value into \""+this.name+"\"");
    }

    private ASTNode convertUserInput(String userInput) {
        Constant value = new Constant(userInput);

        if (userInput.matches("[0-9]+")) {
            value = new Constant(Integer.parseInt(userInput));
        } else if (userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")) {
            value = new Constant(Boolean.parseBoolean(userInput));
        } else if (userInput.matches("[0-9]+\\.[0-9]+")) {
            value = new Constant(Double.parseDouble(userInput));
        }

        return value;
    }
}
