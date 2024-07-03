package com.coforge;

import java.util.Objects;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Employee employee=new Employee(10001,"ram kumar");
        Employee employee1=employee;

        System.out.println(employee);
        System.out.println(employee.equals(employee1));

        Employee employee3=new Employee(10001,"ram kumar");
        System.out.println(employee.equals(employee3));

        System.out.println("hashcode "+employee.hashCode());
        System.out.println("hashcode "+employee1.hashCode());
        System.out.println("hashcode "+employee3.hashCode());

        //Integer s=900l;
        //System.out.println(s.toString());
    }
}
