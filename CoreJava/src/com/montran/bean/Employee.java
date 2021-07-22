package com.montran.bean;

public  class Employee {

	protected int id;
	protected String name;
	float salary;
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void empInfo(){
		System.out.println("emp id  is "+id);
		System.out.println("emp name  is "+name);
		System.out.println("emp salary  is "+salary);
	}
}
