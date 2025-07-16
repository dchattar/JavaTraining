package org.example;

import java.util.Objects;

class Employee {
    String name;
    String age;
    int Salary;

    public Employee(String name, String age, int salary) {
        this.name = name;
        this.age = age;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", Salary=" + Salary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }




}
