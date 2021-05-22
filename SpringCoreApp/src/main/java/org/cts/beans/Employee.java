package org.cts.beans;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	void empInit() {
		id =1009;
		name="amresh kumar";
		
		System.out.println("emp init called");
	}
	
	void empClean() {
		id=0;
		name=null;
		System.out.println("emp destroy called");
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
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

	
	
	
}
