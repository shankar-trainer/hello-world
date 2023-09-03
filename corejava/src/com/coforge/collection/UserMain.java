package com.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;

class UserSortById implements Comparator<User> {
	@Override
	public int compare(User o1, User o2) {
		if (o1.getUserId() > o2.getUserId())
			return 1;
		else if (o1.getUserId() < o2.getUserId())
			return -1;
		return 0;

	}
}
class UserSortBySalary implements Comparator<User> {
	@Override
	public int compare(User o1, User o2) {
				return Float.valueOf(o1.getUserSalary()).compareTo(Float.valueOf(o2.getUserSalary()));
	}
}

public class UserMain {

	public static void main(String[] args) {

		User user[] = new User[] { 
				new User(9009, "surendra mehta", 34000), 
				new User(9002, "pawan kumar", 47000),
				new User(9005, "amit mehra", 14000) 
				};

		System.out.println("\n sort by id ");
		Arrays.sort(user,new UserSortById());
		System.out.println(Arrays.toString(user));
		
		System.out.println("\n sort by salary\n ");
		Arrays.sort(user,new UserSortBySalary());
		System.out.println(Arrays.toString(user));

	}
}
