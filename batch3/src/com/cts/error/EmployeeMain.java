package com.cts.error;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		try {
			employee.setEmployeeId(12345);
			employee.setEmployeeName("a kumar");
			employee.setEmployeeSalary(10000);

			System.out.println("Employee Information");
			System.out.println(employee);

		} catch (EmployeeException e) {
			System.err.println(e.getMessage());
		}
	}
}
