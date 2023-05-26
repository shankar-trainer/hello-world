package edu.chitkara.fileio;

import java.io.Serializable;

public class User  implements Serializable{
	private int id;
	private String name;
	private float salary;

	public User(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
