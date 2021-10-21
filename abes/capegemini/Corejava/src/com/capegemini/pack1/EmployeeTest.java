package com.capegemini.pack1;

import com.capegemini.Employee;

public class EmployeeTest extends Employee{

	void empInfo(){
System.out.println(id+"  "+name+"  "+salary);
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.id=788787;
	    emp.name="rajesh";
	    emp.show();
	    
	    
	    
	}
}
