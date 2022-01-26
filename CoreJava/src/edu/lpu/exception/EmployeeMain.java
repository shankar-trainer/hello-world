package edu.lpu.exception;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		try {
		//employee.setId(0);
	   employee.setId(1300);
		employee.setName("ram kumar");
		employee.setSalary(10000);
		
		System.out.println("Employee data ");
		System.out.println("id is "+employee.getId());
		System.out.println("name is "+employee.getName());
		System.out.println("salary is "+employee.getSalary());
		}
		catch (EmployeeException  e) {
			System.err.println(e.getMessage());
		}
	}
}
