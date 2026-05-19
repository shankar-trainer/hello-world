package com.montran.database.singleton;

public class User {
	private int userId;
	private String userName;

	private User() {

	}

	private User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	static User user;

	public static User getUser() {
		if (user == null) {
			user = new User();
		  //System.out.println("user created");
		}
		return user;
	}

}
