package com.montran.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> userSet = new TreeSet<String>();
		// LinkedHashSet<String>(); // ordered
		// HashSet<String>();// not ordered

		userSet.add("reeta verma");
		userSet.add("geeta sharma");
		userSet.add("reeta verma");
		userSet.add("amita verma");
		userSet.add("sunita verma");
		userSet.add("kavita sharma");

		System.out.println(userSet);
		System.out.println(userSet.size());

		for (String string : userSet) {
			System.out.print(string + " , ");
		}
		System.out.println();
		System.out.println(userSet.contains("reeta verma"));
		System.out.println(userSet.contains("lalita verma"));

		userSet.remove("reeta verma");
		// userSet.clear();

		System.out.println("iterator ");

		Iterator<String> iterator = userSet.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());
	}
}
