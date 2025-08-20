package org.example;

import java.util.Locale;

public class LamdaExpressionDemo {

    public static void main(String[] args) {
        // Using a lambda expression to convert a string to uppercase
        String str = "aniket";
        String upperStr = convertToUpperCase(str, s -> s.toUpperCase(Locale.ROOT));
        System.out.println(upperStr); // Output: HELLO WORLD
    }

    // Method that takes a string and a lambda expression to process it
    public static String convertToUpperCase(String input, StringProcessor processor) {
        return processor.process(input);
    }

    // Functional interface for processing strings
    @FunctionalInterface
    interface StringProcessor {
        String process(String input);
    }

}
