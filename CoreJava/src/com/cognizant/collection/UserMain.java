package com.cognizant.collection;

import java.util.Arrays;
import java.util.Comparator;

public class UserMain {

	public static void main(String[] args) {
		int  id1[]= {1002,1003,1001,1005};
		String nm[]={"rakesh","amit","suresh","kailash"};
		float sal[]= {67000,12000,9000,4000};
		
		User user[]=new User[4];
		
		for (int i = 0; i <user.length; i++) {
			user[i]=new User();
			user[i].setId(id1[i]);
			user[i].setName(nm[i]);
			user[i].setSalary(sal[i]);
		}
		
		Arrays.sort(user,new UserSortById());
		
		System.out.println("sorted by id ");
		for(User u:user) {
			System.out.println(u.getId()+"  "+u.getName()+"  "+u.getSalary());
		}
		
		Arrays.sort(user,new UserSortByName());
		
		System.out.println("sorted by name ");
		for(User u:user) {
			System.out.println(u);
		}
	}
}

class UserSortById  implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		/*if(o1.getId()<o2.getId())
		return -1;
		else if(o1.getId()>o2.getId())
			return 1;
		else 
			return 0;
		*/	
		   // ascending order
		//return new Integer(o1.getId()).compareTo(new Integer(o2.getId()));
		
		//descending order
		return new Integer(o2.getId()).compareTo(new Integer(o1.getId()));
	}
	
}

class UserSortByName  implements Comparator<User>{
	@Override
	public int compare(User o1, User o2) {
	 return o1.getName().compareTo(o2.getName());
	}
}
