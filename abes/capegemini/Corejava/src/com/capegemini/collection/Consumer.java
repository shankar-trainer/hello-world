package com.capegemini.collection;

public class Consumer {

	private int id;
	private String name;
	private String location;
	private String ssn;
	private float salary;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getSsn() {
		return ssn;
	}
	public float getSalary() {
		return salary;
	}
	public Consumer(int id, String name, String location, String ssn,
			float salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.ssn = ssn;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Consumer [id=" + id + ", name=" + name + ", location="
				+ location + ", ssn=" + ssn + ", salary=" + salary + "]";
	}
	
	
}
