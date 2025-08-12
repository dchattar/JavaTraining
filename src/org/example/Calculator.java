package org.example;

public class Calculator {

    int divide(int a, int b) {
        if(b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw an exception
        }
        return a/b;
    }

    int multiply(int a, int b) {
        return a * b;


        //100
    }
}


