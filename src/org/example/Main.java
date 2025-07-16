package org.example;

import java.util.HashSet;


public class Main {


    public static void main(String[] args) {

/*
        ArrayList<Employee>  empList =  new ArrayList<>();
        empList.add(new Employee("Shubhangi", "32", 23423));
        empList.add(new Employee("Shubhangi", "32", 23423));
        empList.add(new Employee("Shubhangi", "32", 23423));
        Employee x = empList.get(2);
*/

        //Set doesn't allow you to store duplicates
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Shubhangi", "32", 23423));
        employees.add(new Employee("Shubhangi", "56", 234543523));
        employees.add(new Employee("Shubhangi", "34", 234));


        for (Employee e : employees) {
            System.out.println(e.toString());
        }

    }
}




//Memory - Stack (a --->?)