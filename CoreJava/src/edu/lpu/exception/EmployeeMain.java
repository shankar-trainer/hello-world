package edu.lpu.exception;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		try {
			emp1.setId(1005);
			emp1.setName("muthu");
			emp1.setSalary(40000);
			
			System.out.println("Employee  Information");
			System.out.println("Employee  id "+emp1.getId());
			System.out.println("Employee  name "+emp1.getName());
			System.out.println("Employee  salary "+emp1.getSalary());
			
		} catch (EmployeeException e) {
		  System.err.println(e.getMessage());	
		}
		
		
		
		
	}
}
