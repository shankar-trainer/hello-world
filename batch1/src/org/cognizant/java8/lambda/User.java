package org.cognizant.java8.lambda;

public class User implements Comparable<User> {
	private String userName;
	private float userSalary;
	private int userId;

	public User(int userId, String userName, float userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + "]";
	}

/*	@Override
	public int compareTo(User o) {
		if (this.userId > o.userId)
			return 1;
		else if (this.userId < o.userId)
			return -1;
		return 0;

	}
	*/

	@Override
	public int compareTo(User o) {
	return   new Integer(this.userId).compareTo(new Integer(o.userId));
	}
	
}
