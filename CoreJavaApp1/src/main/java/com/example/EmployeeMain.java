package com.example;

import com.coforge.Employee;

public class EmployeeMain extends Employee {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.id=89989;
		emp1.name="varsha";
		
		System.out.println("country  is "+new EmployeeMain().country);

		emp1.show();
		
	}
}
