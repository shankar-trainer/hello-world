package org.audintel.model;

public class Employee {

	private int id;
	private String name;
	private float salary;
	
	public void init() {
		this.id=788678;
		this.name="adarsh kumar";
		this.salary=99000.00F;
		System.out.println(" employee init called ");
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
	
	
}
