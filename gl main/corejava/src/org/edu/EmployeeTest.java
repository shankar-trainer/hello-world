package org.edu;

import org.com.Employee;

public class EmployeeTest extends Employee{

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.id=1001;
		employee.name="ram kumar";
		//new EmployeeTest().salary=12000;
		EmployeeTest.salary=12000;
		Employee.salary=90000;
		employee.grossSalary();
		
	}
}
