package org.lpu.model;

public class User {

	private int id;
	private String name;
	private float salary;
	
	public User(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	};
	
	
	
}
