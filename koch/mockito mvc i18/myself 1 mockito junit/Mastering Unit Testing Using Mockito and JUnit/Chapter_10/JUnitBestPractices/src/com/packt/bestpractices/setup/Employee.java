package com.packt.bestpractices.setup;


public class Employee {
	private String lastName;
	private String name;

	public Employee(String lastName , String name) {
		this.lastName = lastName;
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}


	public String getName() {
		return name;
	}

}
