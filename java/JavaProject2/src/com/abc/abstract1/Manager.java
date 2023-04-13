package com.abc.abstract1;
/**
 * Created by shankar on 3/22/2023.
 */
public class Manager  extends  Employee{

    private  float pf;
    private String location;

    public float getPf() {
        return pf;
    }

    public String getLocation() {
        return location;
    }

    public Manager(int empId, String empName, float empSalary, float pf, String location) {
        super(empId, empName, empSalary);
        this.pf = pf;
        this.location = location;
    }


    @Override
    public void employeeInformation() {
        System.out.println("Employee Data");
        System.out.println("\tId"+getEmpId());
        System.out.println("\tName"+getEmpName());
        System.out.println("\tSalary"+getEmpSalary());
        System.out.println("\tPF  "+getPf());
        System.out.println("\tGross Salary  "+(getEmpSalary()-getEmpSalary()*getPf()));
        System.out.println("\tLocation "+getLocation());

    }
}
