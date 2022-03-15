package com.capgemini.io;

import java.io.Serializable;

public class Person  implements  Serializable{

	private transient int id;
	private String name;
	private float salary;
	private static String country="india";

	public String getCountry() {
		return country;
	}
	
	public Person(int id, String name, float salary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
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
