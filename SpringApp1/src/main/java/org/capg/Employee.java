package org.capg;

public class Employee implements Message {
	private int id;
	private String name;
	private float salary;
	
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
	public String display() {
		return "Id is "+getId()+"\nName is "+getName()+"\nSalary is "+getSalary();
	}
	
	
	

}
