package edu.chitkara.collection;

public class User {
	private int userId;
	private String userName;
	private float usersalary;

	public User(int userId, String userName, float usersalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.usersalary = usersalary;
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

	public float getUsersalary() {
		return usersalary;
	}

	public void setUsersalary(float usersalary) {
		this.usersalary = usersalary;
	}

}
