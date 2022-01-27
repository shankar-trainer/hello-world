package com.montran.collection;

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
	public int compareTo(User o) {
	return 	new Integer(this.getUserId()).compareTo(new Integer(o.getUserId()));
		
		/*
		if (this.getUserId() > o.getUserId())
			return 1;
		else if (this.getUserId() < o.getUserId())
			return -1;
		else
			return 0;
       */
	}

}
