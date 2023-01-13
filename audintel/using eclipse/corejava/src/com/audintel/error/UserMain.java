package com.audintel.error;

public class UserMain {

	public static void main(String[] args) {
		
		User user=new User();
		
		try {
			user.setUserId(10000);
			user.setUserName("ram kumar");
			user.setUsersalary(70000);
		
			System.out.println("Id is "+user.getUserId());
			System.out.println("Name is "+user.getUserName());
			System.out.println("salary is "+user.getUsersalary());
			
			
		} catch (UserException e) {
			System.err.println("Error is :"+e.getMessage());
		}
		
	}
}
