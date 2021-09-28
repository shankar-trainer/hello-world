package com.capgemini.error;

public class UserMain {

	public static void main(String[] args) {
		User user = new User();
		try {
			//user.setUserId(0); // id   1000 - 10000
			user.setUserId(1000);
			user.setUserName("ramesh");// name length 5 - 12 chars 
			//user.setUserSalary(-9000);
			//user.setUserSalary(9000);// salary range 10000 - 50000
			user.setUserSalary(19000);
			
			System.out.println("user information ");
			System.out.println(user.getUserId());
			System.out.println(user.getUserName());
			System.out.println(user.getUserSalary());

		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
	}
}
