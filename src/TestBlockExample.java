public class TestBlockExample {

    public static void main(String... args) {

        System.out.println("\n ------------------------------------------------------");
        System.out.print(textBlockOne());
        System.out.println("\n ------------------------------------------------------");
        System.out.print(textBlockTwo());
        System.out.println("\n ------------------------------------------------------");
        System.out.print(textBlockThree());
        System.out.println("\n ------------------------------------------------------");
        System.out.print(textBlockFour());

    }

    /**
     *  Text Blocks prints the equivalent  of:
     *  String hello = "\Hello to Text Blocks\"\n    Introduced in Java 15 as a standard feature"
     */
    private static String textBlockOne(){
        return """
                Hello "Text Blocks"
                    Introduced in Java 15 as a standard feature""";
    }

    /**
     * Adds a newline at the end
     *  Text Blocks prints the equivalent  of:
     *  String hello = "\Hello to Text Blocks\"\n    Introduced in Java 15 as a standard feature\n"
     */
    private static String textBlockTwo(){
        return """
                Hello "Text Blocks"
                    Introduced in Java 15 as a standard feature
                """;
    }

    /**
     *  Using backslash (\) to not add a newline
     *  Text Blocks prints the equivalent  of:
     *  String hello = "\Hello to Text Blocks\"     Introduced in Java 15 as a standard feature\n"
     */
    private static String textBlockThree(){
        return """
                Hello "Text Blocks" \
                    Introduced in Java 15 as a standard feature
                """;
    }

    /**
     *  Using \s to  add two spaces
     *  Text Blocks prints the equivalent  of:
     *  String hello = "\Hello to Text Blocks\"\n  Introduced in Java 15 as a standard feature\n"
     */
    private static String textBlockFour(){
        return """
                Hello "Text Blocks"
                \sIntroduced in Java 15 as a standard feature
                """;
    }
}
