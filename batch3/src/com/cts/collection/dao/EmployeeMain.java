package com.cts.collection.dao;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();

		Employee employee[] = new Employee[3];
		employee[0] = new Employee(12123, "s kumar", 12000);
		employee[1] = new Employee(12121, "p kumar", 12000);
		employee[2] = new Employee(12128, "j kumar", 12000);

		for (Employee employee2 : employee) {
			dao.addEmployee(employee2);
		}

		Employee e1 = new Employee(1, "deepak kumar", 67000);
		try {

			System.out.println("Employee is present \n" + dao.deleteEmployee(employee[1]));
			System.out.println("Employee is present \n" + dao.deleteEmployee(e1));

		} catch (EmployeeException e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println("search employee");
			Employee searchEmployee = dao.searchEmployee(employee[2]);

			if (searchEmployee != null) {
				System.out.println("search employee found ");
				System.out.println(searchEmployee);
			}

		} catch (EmployeeException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("All Employess are as below ");
		for (Employee employee3 : dao.getEmployee()) {
			System.out.println();
			System.out.println(employee3);
		}

	}
}
