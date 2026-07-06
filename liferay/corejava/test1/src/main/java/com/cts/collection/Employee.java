package com.cts.collection;

public class Employee {
  private int empId;
  private  String  empName;
  private  float empsalary;

    public Employee(int empId, String empName, float empsalary) {
        this.empId = empId;
        this.empName = empName;
        this.empsalary = empsalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empsalary=" + empsalary +
                '}';
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

    public float getEmpsalary() {
        return empsalary;
    }

    public void setEmpsalary(float empsalary) {
        this.empsalary = empsalary;
    }
}
