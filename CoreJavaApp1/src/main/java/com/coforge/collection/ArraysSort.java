package com.coforge.collection;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		
		int ar[]= {11,2,3,1,5,4,6};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		User user[]=new User[4];
		user[0]=new User(10003, "pawan kumar", 45000);
		user[1]=new User(10001, "amit kumar", 25000);
		user[2]=new User(10004, "vijay kumar", 95000);
		user[3]=new User(10002, "jai kumar", 15000);

		Arrays.sort(user);
        //User cannot be cast to class java.lang.Comparable		
		System.out.println("after sorting ");
		for (User user2 : user) {
			System.out.println(user2);
		}
	}
}
