package com.capegemini.java8;

public class Person 
// implements   Comparable<Person>
{
	
	private int id;
	private String name;
	private float salary;
	
	/*@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}*/
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public Person(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
