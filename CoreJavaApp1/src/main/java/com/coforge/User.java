package com.coforge;

public class User {

	private int userId;
	private String userName;
	private float userSalary;

	public User(int userId, String userName, float userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public float getUserSalary() {
		return userSalary;
	}

}
