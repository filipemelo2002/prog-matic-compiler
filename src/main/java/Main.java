public class Main {
    private static final String EXTENSION = "pm";
    public static void main(String[] args) {
        String program = args.length > 1 ? args[1]: "test/test." + EXTENSION;

        System.out.println("Compiling file " + program);

    }
}
