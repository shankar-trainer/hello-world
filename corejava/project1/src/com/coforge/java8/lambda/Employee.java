package com.coforge.java8.lambda;

public class Employee {
    private Integer roll;
    private String name;
    private Float salary;

    public Employee(Integer roll, String name, Float salary) {
        this.roll = roll;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public Float getSalary() {
        return salary;
    }
}

