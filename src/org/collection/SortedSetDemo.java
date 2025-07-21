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

