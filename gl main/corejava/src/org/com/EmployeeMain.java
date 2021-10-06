package org.com;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.id=1001;
		employee.name="ramesh kumar";
		employee.salary=67000.56f;
		
		
		System.out.println("Id is "+employee.id);
		System.out.println("Name is "+employee.name);
		System.out.println("Salary is "+employee.salary);
		System.out.println("Gross Salary is "+employee.grossSalary());
	}
}
