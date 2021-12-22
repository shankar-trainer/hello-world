package com.cognizant.error;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		try {
			emp1.setId(988989);
			emp1.setAge(20);
			emp1.setName("anil kumar");

			System.out.println(emp1);
		} catch (EmployeeException e) {
			System.err.println(e.getMessage());
		}
	}
}
