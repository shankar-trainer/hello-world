package com.cts.collection;

import java.util.Arrays;

public class UserMain {

	
	public static void main(String[] args) {
	
		User user[]=new User[4];
	    int id1[]= {1001,1005,1002,1004};
	    String name1[]= {"ram kumar","amit kumar","bhuwanesh kumar","deepak kumar"};
	    float Salary1[]= {10000, 9000, 5000, 20000};
	    
	    for (int i = 0; i < Salary1.length; i++) {
			user[i]=new User(id1[i], name1[i], Salary1[i]);
	    }
			Arrays.sort(user);
			
		
/*			for (User u:user) {
				System.out.println(u);
			}
*/			
			System.out.println(Arrays.toString(user));
			
	
	}
}
