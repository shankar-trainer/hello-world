package com.nec.collection.main;

import java.util.Iterator;

import com.nec.collection.dao.EmployeeDao;
import com.nec.collection.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		int id[] = { 1001, 1004, 1003, 1002 };

		String name[] = { "suresh kumar", "priyansh kumar", "javed akhtar", "salim khan" };
		float salary[] = { 23000, 90000, 78000, 67000 };

		EmployeeDao dao = new EmployeeDao();

		Employee employee[] = new Employee[4];

		for (int i = 0; i < salary.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id[i]);
			employee[i].setName(name[i]);
			employee[i].setSalary(salary[i]);
			dao.addEmployee(employee[i]);
		}

		System.out.println("all employee list operation");

		for (Employee e : dao.getAllEmployee())
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());

		System.out.println("search operation");

		System.out.println(" employee present " + dao.searchEmployee(employee[0]));

		Employee employee2 = new Employee();
		employee2.setId(999);
		employee2.setName("a kumar");

		employee2.setSalary(78000);
		System.out.println(" employee present " + dao.searchEmployee(employee2));

		System.out.println("Emplolyee Remove Operation");

		if (dao.removeEmployee(employee[0]))
			System.out.println("employee removed");
		else
			System.out.println("employee not present ");

		if (dao.removeEmployee(employee2))
			System.out.println("employee removed");
		else
			System.out.println("employee not present ");

		System.out.println("Update Operation ");

		Employee emp1 = employee[2];
		emp1.setName("anand kumar");
		emp1.setSalary(56000);

		if (dao.updateEmployee(emp1)) {
			System.out.println("employee update");
		}

		else
			System.out.println("employee not found");

		System.out.println("after update list of all employees");

		for (Employee e : dao.getAllEmployee())
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());

	}
}
