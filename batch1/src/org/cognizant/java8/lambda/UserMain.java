package org.cognizant.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UserMain {

	public static void main(String[] args) {
		User user[]=new User[3];
		user[0]=new User(10003,"mahadev kumar",12000);
		user[1]=new User(10001,"rahul kumar",10000);
		user[2]=new User(10002,"aditya kumar",18000);
		
		Arrays.sort(user);
		
		System.out.println("after sorting ");
		for (User user2 : user) {
			System.out.println(user2);
		}
		
		ArrayList<User> list1=new ArrayList<>();
		for (User user2 : user) {
			list1.add(user2);
		}
		Collections.sort(list1);
		
		System.out.println("using collections ");
		for (User user2 : list1) {
		    System.out.println(user2);	
		}
	}
}
