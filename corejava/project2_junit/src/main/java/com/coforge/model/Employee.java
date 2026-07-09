package com.coforge.model;

/**
 *
 * Employee class create by
 * @author shankar
 *
 * <br>it has three attributes
 */

public class Employee {
    /**
     * @deprecated
     * in place of id use Employee_Id
     */
    private  int id;
    private  String name;
    private float salary;

    /**
     * Overloaded constructor
     * @param id
     * @param name
     * @param salary
     */
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }
}

