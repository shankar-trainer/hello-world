package main;

import com.abc.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(8787788);
		employee.setName("amit kumar");
		
		System.out.println("Employee information");
		System.out.println("\tid "+employee.getId());
		System.out.println("\tname "+employee.getName());
	}
}
