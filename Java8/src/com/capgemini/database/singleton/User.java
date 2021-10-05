package com.capgemini.database.singleton;

public class User {

	static private User user;

	private int id;
	private String name;

	public static User getUserInstance() {
		if (user == null)
			user = new User();
		return user;
	}

	private User() {
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

}
