package com.coforge.collection;

import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		int id[] = { 10009, 10006, 10002 };
		String nm[] = { "suraj kumar", "anand kumar", "parbhat kumar" };
		float salary[] = { 20000, 34000, 12000 };

		Employee employee[] = new Employee[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpId(id[i]);
			employee[i].setEmpName(nm[i]);
			employee[i].setEmpSalary(salary[i]);
		}

		EmployeeOperation operation = new EmployeeOperation();

		for (Employee employee2 : employee) {
			operation.addEmployee(employee2);
		}
		
		System.out.println("All Employee list");
		List<Employee> allEmployees = operation.getAllEmployees();
		
		for (Employee employee2 : allEmployees) {
			System.out.println(employee2.getEmpId() + "\t" + employee2.getEmpName() + "\t" + employee2.getEmpSalary());
		}

		if (operation.removeEmployee(7))
			System.out.println("removed ");
		else
			System.out.println("not present");

		if (operation.removeEmployee(employee[0]))
			System.out.println("removed ");
		else
			System.out.println("not present");

		System.out.println("after removal all employee list");
		for(Employee emp:operation.getAllEmployees())
			System.out.println(emp);
	}
}
