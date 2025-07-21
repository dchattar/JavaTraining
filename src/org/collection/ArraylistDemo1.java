package org.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArraylistDemo1 {

    //List, Set, Map
    //List - allows duplicates, maintains insertion order
    //Set - does not allow duplicates, does not maintain insertion order,
    //TreeSet - sorted order, natural ordering of elements (based on Comparable interface),
    // HashSet - no order,
    // LinkedHashSet - maintains insertion order
    //Map - key-value pairs, does not allow duplicate keys, maintains insertion order (LinkedHashMap)

    //is there any other Set than these 3, Treeset, HashSet, LinkedHashSet?
    //No, these are the main implementations of the Set interface in Java.

  //  1. read more about basic data structures in c
   //     2. what differt java collections are backed by which data structures?

  //  TreeSet - sorted order, HashSet - no order,

 // what are different data structures in c language?
    //In C, common data structures include arrays, linked lists, stacks, queues, trees, and hash tables.


    public static void main(String[] args) {
        // Example usage of ArrayList
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Shubhangi", "32", 23423));
        empList.add(new Employee("Datta", "32", 23423));
        empList.add(new Employee("Sakshi", "32", 23423));

        System.out.println("Employees in ArrayList:"+empList);

        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Datta", "32", 23423));
        employees.add(new Employee("Shubhangi", "32", 23423));
        employees.add(new Employee("Sakshi", "32", 23423));


        System.out.println("Employees HashSet:"+employees);

        LinkedHashSet <Employee> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Employee("Sakshi", "32", 23423));
        linkedHashSet.add(new Employee("Sakshi", "234", 23423));
        linkedHashSet.add(new Employee("Shubhangi", "32", 23423));

        //how does LinkedHashSet decide if the elements are duplicates or not?
        //LinkedHashSet uses the equals method of the Employee class to determine if two elements are duplicates.

        System.out.println("Employees LinkedHashSet:"+linkedHashSet);

        TreeSet <Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee("Sakshi", "32", 23423));
        treeSet.add(new Employee("Datta", "34", 23423));
        treeSet.add(new Employee("Shubhangi", "38", 23423));

        //how does TreeSet decide if the elements are duplicates or not?
        //TreeSet uses the compareTo method of the Employee class to determine the order of elements
        //and to check for duplicates.

        System.out.println("Employees TreeSet:"+treeSet);


        //create an array of integers
        int [] arr = new int[10];
    }
}
