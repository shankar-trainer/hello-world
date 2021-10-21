package com.cg.eis.bean;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private String designation;
	private String insuranceSCheme;
	
	public Employee(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		
		if((salary>5000 && salary<20000) && (designation.equals("System Associate")))
		 insuranceSCheme = "Scheme C";
		if((salary>20000 && salary<40000) && (designation.equals("Programmer")))
			 insuranceSCheme = "Scheme B";
		
		if((salary>=40000) && (designation.equals("Manager")))
			 insuranceSCheme = "Scheme A";
		if((salary<=5000) && (designation.equals("Clerk")))
			 insuranceSCheme = "No Scheme";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceSCheme() {
		return insuranceSCheme;
	}
	public void setInsuranceSCheme(String insuranceSCheme) {
		this.insuranceSCheme = insuranceSCheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceSCheme=" + insuranceSCheme + "]";
	}

	
	
	

}
