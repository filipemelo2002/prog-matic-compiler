package br.edu.unifg.compiladores.progmatic.ast;

public class Parameter {

    private final String type;

    private final String name;
    private final Object value;

    public Parameter(String type, String name, Object value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
