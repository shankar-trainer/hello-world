package com.abc.database;

public class DatabaseMain {

	public static void main(String[] args) {
		
	Database database1=Database.getDatabase();
	
	Database database2=Database.getDatabase();
	
	
	database1.setUser("user1");
	database1.setPassword("password1");
	
	database2.setUser("user2");
	database2.setPassword("password2");
	
	
	System.out.println("database1 values ");
	System.out.println("user1 "+database1.getUser());
	System.out.println("password1 "+database1.getPassword());
		
	System.out.println("\ndatabase2 values ");
	System.out.println("user2 "+database2.getUser());
	System.out.println("password2 "+database2.getPassword());
	
	}
	
}
