package com.cts;

public abstract class Employee {

    private int employeeId;
    private String employeeName;
    private float employeeSalary;

    public Employee(int employeeId, String employeeName, float employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public abstract float calculateSalary();// abstract  incomplete methods

    void employeeInfo() {
        System.out.println("\t id :" + getEmployeeId());
        System.out.println("\t name :" + getEmployeeName());
        System.out.println("\t salary :"+getEmployeeSalary());
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }
}
