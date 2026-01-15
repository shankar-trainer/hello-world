package com.cts;

// concrete or complete class
public class Manager  extends  Employee{
    private float pf;
    private String location;

    public Manager(int employeeId, String employeeName, float employeeSalary, float pf, String location) {
        super(employeeId, employeeName, employeeSalary); // super calls super class constructor
        this.pf = pf;
        this.location = location;
    }
    @Override
    public float calculateSalary() {
        return getEmployeeSalary()-getEmployeeSalary()*pf;
    }

    @Override
    void employeeInfo() {
        System.out.println("manager data ");
        super.employeeInfo();// super calls super class method

        System.out.println("\t gross salary :"+calculateSalary());
        System.out.println("\t pf :"+pf);
        System.out.println("\t location :"+location);
    }

    public static void main(String[] args) {
//        Employee employee=new Employee();// error abstract class can not be instantiated
        Manager manager=new Manager(10001,"sumit kumar",20000.45f,0.05f,"chennai");
        manager.employeeInfo();
     }


}
