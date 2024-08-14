package io.sandboxdev.variables;

public class LocalVariableExample {

    public static void main(String... args){
        lettersOnly();
        lettersNumbersSymbols();
        beginWithUnderscore();
        beginWithCurrency();
    }

    private static void lettersOnly(){
        String abcdABCD = "Local variable \"abcdABCD\" is valid";
        System.out.println(abcdABCD);
    }

    private static void lettersNumbersSymbols(){
        String aBcE1234_$_ = "Local variable \"aBcE1234_$_\" is valid";
        System.out.println(aBcE1234_$_);
    }

    private static void beginWithUnderscore(){
        String __abc123$ABC = "Local variable \"__abc123$ABC\" is valid";
        System.out.println(__abc123$ABC);
    }

    private static void beginWithCurrency() {
        String $_123abc = "Local variable \"$_123abc\" is valid";
        System.out.println($_123abc);
    }
}
