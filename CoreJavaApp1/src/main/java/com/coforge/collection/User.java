package com.coforge.collection;

public class User implements Comparable<User> {

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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + "]";
	}

	@Override
	public int compareTo(User o) {
		if (this.getUserId() > o.getUserId())
			return 1;

		else if (this.getUserId() < o.getUserId())
			return -1;
		else
			return 0;

	}

}
