package org.lpu.model;

public class User {

	private int id;
	private String name;
	private float salary;
	
	public User(int id, String name, float salary) {
		super();
		System.out.println("constructor called ");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void startup() {
	    id=1;
	    name="sumit verma";
	    salary=78000;
		System.out.println("startup method ");
	}
	
	public void clean() {
		
		System.out.println("destroy  method ");
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	};
	
	
	
}
