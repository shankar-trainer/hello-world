package com.coforge.model.singleton;

public class UserMain {

	public static void main(String[] args) {
		//User user=new User();
		
		User user1=User.getUser();
		User user2=User.getUser();
		
		user1.setUserId(10001);
		user1.setUserName("ram kumar");
		
		user2.setUserId(10002);
		user2.setUserName("shyam kumar");
		
		System.out.println("user1 information");
		System.out.println("\tid "+user1.getUserId());
		System.out.println("\tname "+user1.getUserName());
		
		System.out.println("user2 information");
		System.out.println("\tid "+user2.getUserId());
		System.out.println("\tname "+user2.getUserName());
		
	}
}
