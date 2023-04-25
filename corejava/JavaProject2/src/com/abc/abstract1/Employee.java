package com.abc.abstract1;

public  abstract class Employee {

    private int empId;
    private  String empName;
    private float  empSalary;

    public Employee(int empId, String empName, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public abstract   void employeeInformation();

}
