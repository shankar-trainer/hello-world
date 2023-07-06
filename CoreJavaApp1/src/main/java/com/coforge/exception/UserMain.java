package com.coforge.exception;

public class UserMain {

	public static void main(String[] args) {

		User user = new User();

		try {
//			user.setUserId(0);
//			user.setUserId(1000);
			user.setUserId(5000);
//          user.setUserName("");
//			user.setUserName("gita");
			user.setUserName("gita parsad");
//			user.setUserSalary(-9000);
			user.setUserSalary(9000);

			System.out.println("User data ");
			System.out.println("\tid" + user.getUserId());
			System.out.println("\tname" + user.getUserName());
			System.out.println("\tsalary" + user.getUserSalary());
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
	}
}
