package com.coforge.model;

public class SingletonUserTest {

	public static void main(String[] args) {
		//User user=new User();
		
		User user1=User.getUser();
		user1.setUserId(10001);
		user1.setUserName("harsh choudhary");
	
		
		User user2=User.getUser();
		
		user2.setUserId(10002);
		user2.setUserName("sarthak mittal");
		
		
		System.out.println("user1 information ");
		System.out.println("\tId "+user1.getUserId());
		System.out.println("\tName "+user1.getUserName());
		
		System.out.println("user2 information ");
		System.out.println("\tId "+user2.getUserId());
		System.out.println("\tName "+user2.getUserName());
		
		
	}
}
