package com.capgemini.collection;

import java.util.Set;
import java.util.TreeSet;

public class UserMain {
	public static void userInfo(Set<User> s) {
		System.out.println("id\tname\tsalary");
		for (User u : s)
			System.out.println(u.getId() + "\t" + u.getName() + "\t" + u.getSalary());
	}

	public static void main(String[] args) {
		int id1[] = { 1002, 1001, 1003 };
		float salary1[] = { 30000, 15000, 20000 };
		String nm[] = { "suresh kumar", "amit verma", "priyashu kumar" };

		Set<User> set1 = new TreeSet<>();
		// HashSet<>();
		User user[] = new User[3];

		// TreeSet();
		for (int i = 0; i < user.length; i++) {
			user[i] = new User();
			user[i].setId(id1[i]);
			user[i].setName(nm[i]);
			user[i].setSalary(salary1[i]);
			set1.add(user[i]);
		}

		set1.add(user[0]);
		set1.add(user[2]);
		userInfo(set1);

	}

}
