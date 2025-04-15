package com.abc.singleton;

public class UserMain {

	public static void main(String[] args) {
		
		//User user=new User();
		User user=User.getUser();
		user.setUserId(1001);
		user.setUserName("abhishek");
		
		User user2=User.getUser();
		user2.setUserId(1002);
		user2.setUserName("parshant");
		
		
		System.out.println("User1 ");
		System.out.println("\tId "+user.getUserId());
		System.out.println("\tId "+user.getUserName());
		
		System.out.println("User2 ");
		System.out.println("\tId "+user2.getUserId());
		System.out.println("\tId "+user2.getUserName());
		
	}
}
