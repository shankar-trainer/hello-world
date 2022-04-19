package com.cognizant.model;

public class PersonInnerBean {

	private int id;
	private String name;
	private float salary;
	private Birthday bday;

	public Birthday getBday() {
		return bday;
	}

	public void setBday(Birthday bday) {
		this.bday = bday;
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
