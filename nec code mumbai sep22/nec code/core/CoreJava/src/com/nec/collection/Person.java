package com.nec.collection;

public class Person implements Comparable<Person> {

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

	@Override
	public int compareTo(Person o) {
		/*if
		 *  (this.getId() > o.getId())
			return 1;
		else if (this.getId() < o.getId())
			return -1;
		else
			return 0;
			*/
		//return new Integer(this.getId()).compareTo(o.getId()); // sort by id 
		return this.getName().compareTo(o.getName());	// sort by name
	}

}
