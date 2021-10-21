package com.capegemini.java8;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class UserMain {

	public static void main(String[] args) {
		int id1[] = { 1009, 1002, 1004, 1001 };
		String name[] = { "mohan kumar", "aman kumar", "chandan kumar", "jeevan kumar" };
		float salary[] = { 20000, 15000, 25000, 9000 };

		User user[] = new User[4];

		UserDao dao = new UserDao();

		int x = 0;
		for (User user2 : user) {
			user2 = new User(id1[x], name[x], salary[x]);
			x++;
			dao.addUser(user2);
		}

		Supplier<List<User>> supplier = UserDao::getAllUser1;
		// Supplier<List<User>> supplier=()->UserDao.getAllUser1();

		List<User> list1 = dao.getAllUser();
		/*
		 * for (User user2 : list1) { System.out.println(user2); }
		 */

		list1.stream().forEach(System.out::println);

		System.out.println("Employee having salary >=20000");

		list1.stream().filter(u -> u.getSalary() >= 20000).forEach(System.out::println);
		System.out.println("salary incremented by 5%");

		list1.stream().map(u -> u.getSalary() + u.getSalary() * 0.05).forEach(System.out::println);

		Collections.sort(list1, (o1, o2) -> {
			return new Float(o1.getSalary()).compareTo(new Float(o2.getSalary()));

		});

		System.out.println("\nsorted by salary  \n");

		list1.stream().forEach(System.out::println);

	}
}
