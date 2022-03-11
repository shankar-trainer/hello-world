package com.capgemini.exception;

public class EmployeeMain {
public static void main(String[] args) {
	Employee emp1=new Employee();
	try {
		//emp1.setId(0);
		//emp1.setId(10);
		emp1.setId(1000);
	
	//	emp1.setName("");
		//emp1.setName("ram");
		emp1.setName("ram kumar");
	//	emp1.setSalary(-10000);
	//	emp1.setSalary(1000);
		emp1.setSalary(6000);
		System.out.println(emp1);
	} catch (EmployeeException e) {
		System.err.println(e.getMessage());
	}
}
}
