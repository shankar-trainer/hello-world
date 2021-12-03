package com.cts.database;

public class UserSignletonMain {

	public static void main(String[] args) {
	  //User_Singleton singleton=new User_Singleton();	
		User_Singleton singleton1 =User_Singleton.getInstance();
		
		singleton1.setId(1001);
		singleton1.setName(" r kumar");
		singleton1.setAge(30);
		
		User_Singleton singleton2 =User_Singleton.getInstance();
		
		//singleton2.setId(1002);
		//singleton2.setName("s kumar");
		//singleton2.setAge(31);


		System.out.println(singleton1.getId()+"  "+singleton1.getName()+"  "+singleton1.getAge());
		System.out.println(singleton2.getId()+"  "+singleton2.getName()+"  "+singleton2.getAge());
	}
}
