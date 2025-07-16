package org.example;

import java.util.HashMap;


public class HashMapDemo {

    public static void main(String[] args) {
        // Create a HashMap to store employee names and their salaries
        HashMap<String, Employee> employeeSalaries = new HashMap<>();

        // Adding employees to the HashMap
        employeeSalaries.put("Alice", new Employee("Alice", "30", 50000));
        employeeSalaries.put("Bob", new Employee("Bob", "28", 60000));
        employeeSalaries.put("Charlie", new Employee( "Charlie", "35", 70000));
/*
        String str = "Aniket";

        String str1 = str;

       str =  str.replace('A', 'a');

        if(str1 == str) {
            System.out.println("Strings objects equal");
        } else {
            System.out.println("Strings objects not equal");
        }
        */
        // Adding another employee with the same name (will overwrite the previous entry)


        // Displaying the HashMap
        System.out.println("Employees: " + employeeSalaries);

        // Accessing a specific employee's salary
        System.out.println("Salary of Alice: " + employeeSalaries.get("Alice"));

     //   employeeSalaries.remove("Bob");

        // Checking if an employee exists
        if (employeeSalaries.containsKey("Bob")) {
            System.out.println("Bob's  is available.");
        } else {
            System.out.println("Bob's  is not available.");
        }

        // Removing an employee
        employeeSalaries.remove("Charlie");
        System.out.println("After removing Charlie: " + employeeSalaries);
    }
}


