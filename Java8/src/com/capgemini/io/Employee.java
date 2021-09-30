package com.capgemini.io;

import java.io.Serializable;

public class Employee implements Serializable {

	transient int id;
	String name;
	float salary;
	static String country="india";
    //transient and static cannot be serialized   
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "Country "+Employee.country+"]";
	}

}
