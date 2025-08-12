package org.collection;


public class Employee implements Comparable{
    String name;
    String age;
    int salary;

    public Employee(String name, String age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Employee other)) {
            throw new ClassCastException("Invalid object for comparison");
        }

        return Integer.compare(Integer.parseInt(this.age), Integer.parseInt(other.age));
    }
}