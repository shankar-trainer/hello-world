package com.cognizant.collection;

import java.util.ArrayList;
import java.util.List;

public class ListProggram3 {

	public static void main(String[] args) {
		List<String> booklist1 = new ArrayList<>();
		List<String> booklist2 = new ArrayList<>();

		booklist1.add("java beginner");
		booklist1.add("java expert");
		booklist1.add("java intermediate ");
		booklist1.add("java 8");
		booklist1.add("spring in action");
		booklist1.add("hibernate  in action");

		booklist2.add("anand math");
		booklist2.add("java expert");
		booklist2.add("gaban");
		booklist2.add("godan");
		booklist2.add("two state");
		booklist2.add("java beginner");

		System.out.println(booklist1);
		System.out.println(booklist2);

		booklist1.addAll(booklist2);

		System.out.println(booklist1);

		System.out.println(booklist1.containsAll(booklist2));
		booklist1.retainAll(booklist2);

		System.out.println(booklist1);
	}
}
