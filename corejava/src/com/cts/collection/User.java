package com.cts.collection;

public class User implements Comparable<User> {

	private int UserId;
	private String UserName;
	private float UserSalary;

	public User(int userId, String userName, float userSalary) {
		super();
		UserId = userId;
		UserName = userName;
		UserSalary = userSalary;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserSalary=" + UserSalary + "]";
	}

	@Override
	public int compareTo(User o) {
		if (this.UserId > o.UserId)
			return 1;

		else if (this.UserId < o.UserId)
			return -1;
		else
			return 0;
	}

}
