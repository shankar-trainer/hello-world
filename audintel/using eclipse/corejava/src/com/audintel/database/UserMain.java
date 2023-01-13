package com.audintel.database;

import com.audintel.database.singleton.User;

public class UserMain {

	public static void main(String[] args) {
		
		//User user=new User();
		
		User user1 = User.getUserInstance();
		
		user1.setId(676767);
		user1.setName("amit kumar");
		
		User user2 = User.getUserInstance();
		
		user2.setId(676768);
		user2.setName("sumit kumar");
	
		System.out.println("user1 ");
		System.out.println("\tid is "+user1.getId()+" name "+user1.getName());
		System.out.println("user2 ");
		System.out.println("\tid is "+user2.getId()+" name "+user2.getName());
	}
}
