package org.cts;

import com.cts.Employee;

public class EmployeeProgram  extends Employee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.id=787887;
		employee.name="suman kumar";
		EmployeeProgram employeeProgram=new EmployeeProgram();
		
		employeeProgram.salary=787789;
	
		employee.empInfo();
		employeeProgram.empInfo();
	}
}
