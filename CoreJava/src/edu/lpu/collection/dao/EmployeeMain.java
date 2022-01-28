package edu.lpu.collection.dao;

import java.util.List;

import edu.lpu.collection.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		int id1[] = { 1009, 1004, 1001, 1002 };
		String nm[] = { "om parkash", "jai parkash", "amrit kumar", "ram partap" };
		float sal[] = { 20000, 16000, 45000, 17000 };

		Employee employee[] = new Employee[4];

		EmployeeDao dao = new EmployeeDao();

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(nm[i]);
			employee[i].setSalary(sal[i]);
			dao.addEmployee(employee[i]);
		}
		System.out.println("Total employee added " + employee.length);

		System.out.println("employee1 is present " + dao.searchEmployee(employee[0]));

		System.out.println("all employee  list ");

		List<Employee> employee2 = dao.getEmployee();

		for (Employee employee3 : employee2) {
			System.out.println(employee3.getId() + " " + employee3.getName() + "  " + employee3.getSalary());
		}
	}
}
