package com.tvscredit.controller;


import com.tvscredit.model.Employee;

public class EmployeeData {
	static int id[] = { 10001, 10002, 10003, 10004, 10005, 10006 };
	static String name[] = { "mohan kumar", "ravi kumar", "ajav kumar", "vijay kumar", "sanajay kumar", "jai kumar" };
	static float salary[] = { 23000, 11000, 45000, 56000, 67000, 34000 };

	static Employee employee[] = new Employee[8];
	
	public static Employee[] getEmpdata() {
		for (int i = 0; i <=5; i++) {
			employee[i] = new Employee();
			employee[i].setId(id[i]);
			employee[i].setName(name[i]);

			employee[i].setSalary(salary[i]);
		}
		return employee;
	}
public static void addEmployee(Employee emp) {

	employee[6]=new Employee();
	employee[6].setId(emp.getId());
	employee[6].setName(emp.getName());
	employee[6].setSalary(emp.getSalary());
	
}	
	

}
