package com.wipro;

public class EmployeeMain {
    public static void main(String[] args) {
        // inside same package one class can  access another class, attribute, methods  directly
       // no need to import the class
       // class, attribute, methods can be default
        Employee employee=new Employee();
        employee.id=99889;
        employee.name="kamal kumar";
        System.out.println("id is "+employee.id);
        System.out.println("name is "+employee.name);
    }
}
