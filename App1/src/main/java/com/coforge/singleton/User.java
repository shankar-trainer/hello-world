package com.coforge.singleton;

public class User {
	private int id;
	private String name;

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
	
	private static User user;
	
	public static User  getUser() {
		if(user==null)
			user=new User();
		return user;
	}

}
