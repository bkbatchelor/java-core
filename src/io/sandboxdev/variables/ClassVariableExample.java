package io.sandboxdev.variables;

public class ClassVariableExample {
    private static boolean booleanDefault;
    private static byte byteDefault;
    private static short shortDefault;
    private static int intDefault;
    private static long longDefault;

    public static void main(String... args){
        booleanDefaultValue();
        byteDefaultValue();
        shortDefaultValue();
        intDefaultValue();
        longDefaultValue();
    }

    private static void booleanDefaultValue(){
        System.out.println(booleanDefault);
    }

    private static void byteDefaultValue(){
        System.out.println(byteDefault);
    }

    private static void shortDefaultValue(){
        System.out.println(shortDefault);
    }

    private static void intDefaultValue(){
        System.out.println(intDefault);
    }

    private static void longDefaultValue(){
        System.out.println(longDefault);
    }
}
