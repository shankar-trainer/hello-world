package com.coforge.exception;

public class Employee {
    private int empId;
    private String  empName;
    private float empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) throws EmployeeException {
        if(empId<=0)
            throw new EmployeeException("invalid id");
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) throws EmployeeException {
        if(empName.isBlank())
            throw new EmployeeException("invalid name");
        else if(empName.length()<5 || empName.length()>15)
            throw new EmployeeException("name must of 5- 15 chars ");

        this.empName = empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) throws EmployeeException {
        if(empSalary<=0)
            throw new EmployeeException("invalid salary");
        else if(empSalary<10000 || empSalary>50000)
            throw new EmployeeException("salary must be between 10000 - 50000");

        this.empSalary = empSalary;
    }
}
