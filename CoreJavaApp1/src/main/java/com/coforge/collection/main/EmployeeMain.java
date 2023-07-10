package com.coforge.collection.main;

import java.util.Set;

import com.coforge.collection.dao.EmployeeOperation;
import com.coforge.collection.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeOperation operation = new EmployeeOperation();

		Employee employee[] = new Employee[4];
		employee[0] = new Employee(10003, "suman kumar", 25000);
		employee[1] = new Employee(10001, "babloo kumar", 35000);
		employee[2] = new Employee(10004, "amit kumar", 15000);
		employee[3] = new Employee(10002, "jagat kumar", 55000);

		System.out.println("Employee Add Operation ");
		for (Employee employee2 : employee)
			operation.addEmployee(employee2);

		System.out.println("Employee get All Operation ");
		Set<Employee> allEmployee = operation.getAllEmployee();

		for (Employee employee2 : allEmployee)
			System.out.println(employee2.getEmpId() + "\t" + employee2.getEmpName() + "\t" + employee2.getEmpSalary());

		System.out.println("==============search operation==============");
		Employee searchEmployee = operation.searchEmployee(employee[2]);

		if (searchEmployee == null)
			System.out.println("not found ");
		else
			System.out.println("found " + searchEmployee);

		Employee employee3 = new Employee(4555, "salman", 45000);

		Employee searchEmployee1 = operation.searchEmployee(employee3);

		if (searchEmployee1 == null)
			System.out.println("not found ");
		else
			System.out.println("found " + searchEmployee1);
		
		System.out.println("add operation ");
		if(operation.addEmployee(employee3))
			System.out.println("employee record added");
		else 
			System.out.println("employee already present ");
		
		if(operation.addEmployee(employee3))
			System.out.println("employee record added");
		else 
			System.out.println("employee already present ");

	}
}
