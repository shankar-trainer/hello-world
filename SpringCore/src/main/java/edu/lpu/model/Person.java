package edu.lpu.model;

public class Person {

	private int id;
	private String name;
	private float salary;
	public Person(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void startup() {
		System.out.println("init/startup called ");
	}
	
	public void cleanup() {
		
		System.out.println("cleanup called ");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}
	
	
	
}
