package com.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class UserMain1 {

	public static void main(String[] args) {

		User user[] = new User[] { new User(9009, "surendra mehta", 34000), new User(9002, "pawan kumar", 47000),
				new User(9005, "amit mehra", 14000) };

		System.out.println("sorted by id ");
		System.out.println(Arrays.toString(user));

		Arrays.sort(user, (a, b) -> {
			return Float.valueOf(a.getUserSalary()).compareTo(Float.valueOf(b.getUserSalary()));
		});

		System.out.println("sorted by salary");
		System.out.println(Arrays.toString(user));

		System.out.println("sort by name  ");
		Stream.of(user).sorted((a, b) -> {
			return (a.getUserName()).compareTo((b.getUserName()));
		}
		).forEach(a -> System.out.println(a.getUserId() + "\t" + a.getUserName() + "\t" + a.getUserSalary()));

	}

}