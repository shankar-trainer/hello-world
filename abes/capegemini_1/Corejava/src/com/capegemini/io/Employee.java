package com.capegemini.io;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private  transient float salary;
	
	public static String getCountry() {
		return country;
	}

	private static  String country="india";

	public Employee(int id, String name, float salary, String country1) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		country=country1;
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
