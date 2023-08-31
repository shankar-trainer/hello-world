package com.coforge.abc;

public interface Account {
	float rate = 0.0f;

	// no instance variable
//public static final   float rate;
	void deposit(float amt);

	void withdraw(float amt);
}

abstract interface User {
	String country = "india";
	String state = "delhi";

	void userInfo();
}

abstract class AccountUser {
	private int id;
	private String name;
	private float salary;

	public AccountUser(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public abstract void  accountUserInfo();
}