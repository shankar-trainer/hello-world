package com.coforge.exception;

public class UserMain {

	public static void main(String[] args) {

		User user = new User();

		try {
//			user.setUserId(0);
			user.setUserId(1000);
	//		user.setUserName("");
			user.setUserName("ram kumar");
	//		user.setUserSalary(0);
			user.setUserSalary(100000);
			System.out.println(user);
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

	}
}
