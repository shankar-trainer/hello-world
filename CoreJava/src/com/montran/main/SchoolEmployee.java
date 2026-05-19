package com.montran.main;

import com.montran.bean.Employee;

public class SchoolEmployee extends Employee {

	public SchoolEmployee(int id, String name, float salary) {
		super(id, name, salary);
	}
	
	public static void main(String[] args) {
		SchoolEmployee employee=new SchoolEmployee(1222,"s kumar", 67000.0f);
		System.out.println(employee.id);
		System.out.println(employee.name);
		//System.out.println(employee.salary);
		
		Employee employee2=new Employee(444, "geetha",67344);
	//	System.out.println(employee2.id);
		//System.out.println(employee2.name);
	}
	
	

}
