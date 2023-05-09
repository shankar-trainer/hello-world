package com.nec;

public class EmployeeMain {

	public static void main(String[] args) {
    
		Employee employee=new Employee();
		employee.setId(1001);
		employee.setName("rahul kumar");;
		employee.setSalary(20000);
		
		System.out.println("employee record ");
		
		System.out.println("\tid is "+employee.getId());
		System.out.println("\tid is "+employee.getName());
		System.out.println("\tid is "+employee.getSalary());
		
	}
}
