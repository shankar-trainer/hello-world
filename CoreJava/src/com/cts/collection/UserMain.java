package com.cts.collection;

public class UserMain {

	public static void main(String[] args) {
		
		//User user=new User();
		
		User user=User.getInstance();
		
		user.setUserId(101);
		user.setUserName("suresh kumar");
		user.setUserLocation("chennai");
		
		User user1=User.getInstance();
		
		System.out.println(user.getUserId()+"  "+user.getUserName()+"  "+user.getUserLocation());
		System.out.println(user1.getUserId()+"  "+user1.getUserName()+"  "+user1.getUserLocation());
		
		
	}
}
