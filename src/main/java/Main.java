import antlr4.br.edu.unifg.compiladores.progmatic.ProgMaticLexer;
import antlr4.br.edu.unifg.compiladores.progmatic.ProgMaticParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    private static final String EXTENSION = "pm";
    public static void main(String[] args) {
        String program = args.length > 1 ? args[1]: "./src/test/test." + EXTENSION;

        System.out.println("Compiling file " + program);

        try {
            CharStream fileStream = CharStreams.fromFileName(program);

            ProgMaticLexer lexer = new ProgMaticLexer(fileStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            ProgMaticParser parser = new ProgMaticParser(tokens);

            ProgMaticParser.ProgramContext tree = parser.program();

            ProgMaticCustomVisitor visitor = new ProgMaticCustomVisitor();

            visitor.visit(tree);

        } catch(IOException exception) {
            System.out.println("Error processing file " + program);
        }

    }
}
