package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_employee")
public class Employee {

    @Id
    @Column(name = "employeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    @Column(name = "employeeName",nullable = false,length = 30)
    private String empName;

    @Column(name = "employeeSalary",nullable = false)
    private float empSalary;

    @Column(name = "employeeLocation",nullable = false,length = 30)
    private String location;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }
}
