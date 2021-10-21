package org.cts.model;

public class Manager {
	private String location;
	private String bankName;
	
	private int id;
	
	private String name;
	private float salary ;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Manager [location=" + location + ", bankName=" + bankName + ", id=" + id + ", name=" + name
				+ ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
}
