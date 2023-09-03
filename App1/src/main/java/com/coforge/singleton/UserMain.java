package com.coforge.singleton;

public class UserMain {


	public static void main(String[] args) {
		//User user=new User();
		
		User user1=User.getUser();
		
		user1.setId(1001);
		user1.setName("shyam kumar");
		
		User user2=User.getUser();

		user2.setId(1002);
		user2.setName("kamal kumar");

		
		System.out.println("User1 data ");
		System.out.println("\tid "+user1.getId());
		System.out.println("\tname "+user1.getName());
		
		System.out.println("\tUser2 data ");
		System.out.println("\tid "+user2.getId());
		System.out.println("\tname "+user2.getName());
	}
}
