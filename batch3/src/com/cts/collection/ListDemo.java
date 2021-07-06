package com.cts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();

		// list1.add(12344);
		list1.add("chennai");
		list1.add("madurai");
		list1.add("rameswaram");
		list1.add("kanyakumari");
		list1.add("shivkashi");

		// Iterable<Integer> i;
		// list1.remove(1);
		// list1.remove("shivkashi");

		for (String s : list1) {
			System.out.print(s + " ,");
		}

		System.out.println("\n\nusing iterator \n");
		Iterator<String> it = list1.iterator();

		while (it.hasNext()) {
			String s1 = it.next();
			if (s1.equals("rameswaram"))
				it.remove();
			else
				System.out.println(s1);
		}
		
		System.out.println(list1);
		System.out.println(list1.contains("kanyakumari"));
		System.out.println(list1.contains("rameswaram"));
	}
}
