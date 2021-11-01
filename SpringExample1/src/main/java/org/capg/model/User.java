package org.capg.model;

public class User {
	private int userId;
	private String userName;
	private String Email;

	public User(int userId, String userName, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		Email = email;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return Email;
	}

	
}
