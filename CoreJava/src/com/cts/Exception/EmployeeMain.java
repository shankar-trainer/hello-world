package com.cts.Exception;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();

		try {
			employee.setEmpId(-10001);
			employee.setEmpName("s kumar");
			employee.setEmpSalary(-99000);
			
			System.out.println("Employee Information ");
			System.out.println("\tId"+employee.getEmpId());
			System.out.println("\tName"+employee.getEmpName());
			System.out.println("\tSalary"+employee.getEmpSalary());

		} catch (EmployeeException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
