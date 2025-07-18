package org.collection;

public class ComparatorDemo {

    public static void main(String[] args) {
        // Example usage of Comparator
        Employee emp1 = new Employee("Alice", "30", 50000);
        Employee emp2 = new Employee("Bob", "25", 60000);


        int comparisonResult = emp1.compare(emp1, emp2);

        if (comparisonResult < 0) {
            System.out.println(emp1.name + " has a lower salary than " + emp2.name);
        } else if (comparisonResult > 0) {
            System.out.println(emp1.name + " has a higher salary than " + emp2.name);
        } else {
            System.out.println(emp1.name + " has the same salary as " + emp2.name);
        }
    }

}
