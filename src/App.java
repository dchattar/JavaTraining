//Polymorphism in Java

//compile/run time polimorphism

//JVM/JRE __ Java Virtual Machine//Java Runtime Environment -> windows/Linux/Mac etc -> JVM 
//Platform independent - //Java code is compiled into bytecode, which can run on any platform with a JVM

import java.util.Scanner;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }    
}

//compile time polymorphism - method overloading
//runtime polymorphism - method overriding

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}



//please addd a class named PolyDemo having main method and create an object of Animal class and call the sound method with and without parameter
public class App {
    public static void main(String[] args) {
        //accept input from Console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an object type   :");
        String input = scanner.nextLine();
        scanner.close();
        //create an object of Animal class based on input
        Animal animal = null;
        if (input.equalsIgnoreCase("Animal")) {
            animal = new Animal();
                animal.sound();
        } else if (input.equalsIgnoreCase("Dog")) {
            animal = new Dog();
            animal.sound();
        } else if (input.equalsIgnoreCase("Cat")) {
            animal = new Cat();
            animal.sound();
        } else {        
            System.out.println("Unknown type");
        }                
    }
}



