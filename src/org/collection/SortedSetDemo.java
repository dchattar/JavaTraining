package org.collection;

class Officer implements Comparable<Officer> {
    private String name;
    private String age;
    private int salary;

    public Officer(String name, String age, int salary) {
        this.name = name; // this is a reference to the current object
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Officer other) {
        int result =  Integer.compare(Integer.parseInt(other.age), Integer.parseInt(this.age));
        return result;
    }

    @Override
    public String toString() {
        return "Officer{name='" + name + "', age='" + age + "', salary=" + salary + '}';
    }
}

class SortedSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet to store Employee objects
        java.util.SortedSet<Officer> officers = new java.util.TreeSet<>();

        // Adding employees to the SortedSet
        officers.add(new Officer("Bob", "30", 50000));
        officers.add(new Officer("Alice", "28", 60000));
        officers.add(new Officer("David", "35", 70000));
        officers.add(new Officer("Charlie", "40", 55000));

        // Displaying the SortedSet
        System.out.println("Officers in sorted order by salary:");
        for (Officer officer : officers) {
            System.out.println(officer);
        }
    }
}

//tell me more about a TreeSet
// A TreeSet is a part of the Java Collections Framework and implements the Set interface.
// It is a collection that stores elements in a sorted order, based on their natural ordering or a specified comparator.
// Here are some key features of a TreeSet:
// 1. **Sorted Order**: Elements in a TreeSet are stored in a sorted order, which means that when you iterate over the elements, they will be returned in ascending order.
// 2. **No Duplicates**: A TreeSet does not allow duplicate elements. If you try to add an element that is already present, it will not be added again.
/


