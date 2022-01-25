package org.lpu;

import edu.lpu.Employee;

public class EmployeeMain  extends Employee{

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.id=899898;
		emp.name="partap chandra";
		emp.empData();
		//emp.location="delhi"//outside package protected can not be used

		EmployeeMain employeeMain=new EmployeeMain();
		employeeMain.location="chennai";
		System.out.println("location "+employeeMain.location);
	}
}
