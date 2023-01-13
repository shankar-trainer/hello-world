package com.example.model;

public class Employee {

	  public int empId;   //public  outside package 1.using object 2. inheritance
	  public String  empName;
	  public float  empSalary;
	 protected String location; //protected  outside package  by inheritance
   	 public void empInformation() {
		 System.out.println("employee information");
		 System.out.println("\tid is "+empId);
		 System.out.println("\tname is "+empName);
		 System.out.println("\tsalary is "+empSalary);
		 System.out.println("\tlocation is "+location);
	 }
	 
}
