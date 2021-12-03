package com.cts.database;

public class User_Singleton {

	private int id;
	private int age;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private User_Singleton() {
	}

	static User_Singleton singleton;

	public static User_Singleton getInstance() {
		if (singleton == null)
			singleton = new User_Singleton();
		return singleton;
	}
}
