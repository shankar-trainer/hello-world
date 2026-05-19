package com.montran.database.singleton;

public class UserMain {

	public static void main(String[] args) {
		//User user=new User(788787,"a kumar");  // cannot make the instance 
		
		User user1=User.getUser();
		User user2=User.getUser();
		
		//System.out.println(user1==user2);
		
		user1.setUserId(100001);
		user1.setUserName("p kumar");
		
		user2.setUserId(100002);
		user2.setUserName("s kumar");
		
		System.out.println("user1 information ");
		System.out.println(user1.getUserId()+"  "+user1.getUserName());
		
		System.out.println("\nuser2 information ");
		System.out.println(user2.getUserId()+"  "+user2.getUserName());
		
	}
}
