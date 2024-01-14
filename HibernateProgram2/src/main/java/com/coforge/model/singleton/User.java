package com.coforge.model.singleton;

public class User {

	private int userId;
	private String userName;

	private User() {
	}

	private static User user;

	static User getUser() {
		if (user == null)
			user = new User();
		return user;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
