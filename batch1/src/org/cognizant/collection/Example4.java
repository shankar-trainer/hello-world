package org.cognizant.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example4 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>(20);

		list1.add("chennai");
		list1.add("madurai");
		list1.add("ooty");
		list1.add("shivkashi");
		list1.add("kanchipuram");

		ListIterator<String> it = list1.listIterator();

		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

		System.out.println("\n in reverse direction\n ");

		System.out.println(it.previous());
		System.out.println(it.previous());
		System.out.println(it.previous());

	}
}
