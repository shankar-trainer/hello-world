package com.montran.collection;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		User user[] = new User[4];
		user[0] = new User(7887, "parvin kumar", 20000);
		user[1] = new User(7881, "jayant kumar", 10000);
		user[2] = new User(7889, "amit kumar", 30000);
		user[3] = new User(7882, "suman kumar", 12000);
		
		Arrays.sort(user);
		
		for(User u:user )
			System.out.println(u.getUserId()+" "+u.getUserName()+"  "+u.getUserSalary());

	}
}
