package com.nec.collection;

import java.util.Arrays;
import java.util.Comparator;

class userSortByName implements Comparator<User> {
	@Override
	public int compare(User o1, User o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class userSortBySalary implements Comparator<User> {
	@Override
	public int compare(User o1, User o2) {
		return Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary()));
	}
}

public class Usermain {

	public static void main(String[] args) {
		User user[] = new User[4];
		int id[] = { 1001, 1004, 1003, 1002 };

		String name[] = { "suresh kumar", "priyansh kumar", "javed akhtar", "salim khan" };
		float salary[] = { 23000, 90000, 78000, 67000 };

		for (int i = 0; i < salary.length; i++) {
			user[i] = new User();
			user[i].setId(id[i]);
			user[i].setName(name[i]);
			user[i].setSalary(salary[i]);
		}

		System.out.println(Arrays.toString(user));
		Arrays.sort(user, new userSortByName());
		
		System.out.println("after sorting by name \n");
		System.out.println(Arrays.toString(user));

		Arrays.sort(user, new userSortBySalary());
		
		System.out.println("after sorting bysalary \n");
		System.out.println(Arrays.toString(user));

	}
}
