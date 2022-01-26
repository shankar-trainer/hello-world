package org.lpu;

public class Employee {

	public  int id;
	public String name;
	protected String location;
	public float salary;
	
	public void  empInfo() {
		System.out.println("employee information");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
	
}
