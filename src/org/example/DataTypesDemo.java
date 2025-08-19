package org.example;

public class DataTypesDemo {
    int i;
    Integer I;
    long l; //
    Long L; // Uncommenting this will cause a compilation error due to duplicate variable name
    float f;
    Float F;
    double d;
    Double D; // Uncommenting this will cause a compilation error due to duplicate variable name
    char c;
    Character C; // Uncommenting this will cause a compilation error due to duplicate variable name
    boolean b = true;
    Boolean B; // Uncommenting this will cause a compilation error due to duplicate variable name
    String s;

    public static void main(String arg[]) {
    /*    System.out.println("value of i: " + new DataTypesDemo().i);
        System.out.println("value of I: " + new DataTypesDemo().I);
        System.out.println("value of l: " + new DataTypesDemo().l);
        System.out.println("value of f: " + new DataTypesDemo().f);
        System.out.println("value of d: " + new DataTypesDemo().d);
        System.out.println("value of c: " + new DataTypesDemo().c);
        System.out.println("value of b: " + new DataTypesDemo().b);
        System.out.println("value of s: " + new DataTypesDemo().s);
        System.out.println("value of F: " + new DataTypesDemo().F);
        System.out.println("value of B: " + new DataTypesDemo().B);
        System.out.println("value of L: " + new DataTypesDemo().L);
        System.out.println("value of D: " + new DataTypesDemo().D);
        System.out.println("value of C: " + new DataTypesDemo().C);

        int i  = 10; //how much memory is allocated for this variable?
        // in java int is a primitive data type and occupies 4 bytes of memory.
        //Integer I = 10; // Integer is a wrapper class for int and occupies more memory than primitive types.
         int max  = 2147483647; //DB -> instagram - > users - upload

         int min =  -2147483648;
         System.out.println("Max value of int: " + max);
        //what is int range?
        // The range of int in Java is from -2,147,483,648 to 2,147,483,647.

        Integer I =  i; // Autoboxing: primitive to wrapper class
        System.out.println("Autoboxed Integer I: " + I);
        // Unboxing: wrapper class to primitive
        int j = I; // Unboxing: wrapper class to primitive
        System.out.println("Unboxed int j: " + j);
 */


        int i = 11;
        int j = 11;
        System.out.println("Incremented i: " + i--);
        System.out.println("Incremented i: " + ++j);
        System.out.println("i" + i);

        //operators in java
        // Arithmetic Operators: +, -, *, /, %
        // Relational Operators: ==, !=, >, <, >=, <=
        // Logical Operators: &&, ||, !
        // Bitwise Operators: &, |, ^, ~, <<, >>
        // Assignment Operators: =, +=, -=, *=, /=, %=
        // Unary Operators: ++, --, +, -
        // Ternary Operator: ? :
        // Instanceof Operator: instanceof
        // Type Casting: (type) value
        // Precedence and Associativity: Determines the order of evaluation of operators
        // Increment and Decrement Operators: ++, -- (both prefix and postfix)

        //example of bitwise operator
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int bitwiseAnd = a & b; // 0001 in binary, which is 1 in decimal
        int bitwiseOr = a | b; // 0111 in

         i += 1; // This is equivalent to i = i + 1; (incrementing i by 1)
        i++;
        i = i+ 1;



        Integer intObject = 10;

        if(intObject instanceof Integer) {
            System.out.println("intObject is an instance of Integer");
        } else {
            System.out.println("intObject is not an instance of Integer");
        }





        Vehicle ve = new Truck();

        float f = 23.3f; // char is a primitive data type and occupies 2 bytes of memory in Java (UTF-16 encoding)
         i = (int)f;

         System.out.println("after typecasting"+ i);

        if(ve instanceof Truck) {
            System.out.println("ve is an instance of Truck");
        } else {
            System.out.println("ve is an instance of Car");
        }

    }


    //what is difference between i++ and ++i?

    //when can you do type casting?
    // Type casting can be done when you want to convert a variable from one data type to another.
    // It is commonly used when you want to convert a larger data type to a smaller data type (narrowing conversion) or when you want to convert a smaller data type to a
    // larger data type (widening conversion). In Java, you can perform type casting between compatible data types, such as from int to double or from float to int.
    // Type casting is also used when you want to convert an object of a subclass to its superclass or vice versa.
}


class Vehicle {

}

class Car extends Vehicle {
    // B is a subclass of A
}

class Truck extends Vehicle {
    // C is a subclass of A
}
