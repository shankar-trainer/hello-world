package com.edu;

import com.cts.Employee;

public class EmployeeMain  extends Employee{
public static void main(String[] args) {
	Employee emp1=new Employee();
	
	
	emp1.id=9898;
	emp1.name="surendra kumar";
	emp1.empInfo();
	EmployeeMain employeeMain=new EmployeeMain();
	employeeMain.country="india";
}
}
