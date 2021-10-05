package com.capgemini.database.singleton;

public class UserMain {

	public static void main(String[] args) {
		
		//User user=new User();
		
		User user1=User.getUserInstance();
		
		user1.setId(10001);
		user1.setName("gaurav kumar");
		
		User user2=User.getUserInstance();
		
		user2.setId(10002);
		user2.setName("saurav kumar");
		
		
		System.out.println("User1 ");
		System.out.println(user1.getId()+"   "+user1.getName());
		
		
		System.out.println("User2 ");
		System.out.println(user2.getId()+"   "+user2.getName());
		
		
		
		
	}
}
