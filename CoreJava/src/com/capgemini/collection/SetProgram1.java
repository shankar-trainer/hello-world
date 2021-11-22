package com.capgemini.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram1 {

	public static void main(String[] args) {

		Set<String> set1 = new LinkedHashSet<>();//ordered
				//TreeSet<>();// sorted
				//HashSet<>(); // not ordered
		set1.add("hello");
		set1.add("welcome");
		set1.add("hello");
		set1.add("greeting");
		set1.add("bye");

		System.out.println(set1);

		System.out.println("using for each ");
		for (String string : set1) {
			System.out.println(string);
		}

		System.out.println("removing");
		set1.remove("hello");

		System.out.println(set1.contains("hello"));
		System.out.println(set1.contains("bye"));

		Iterator<String> iterator = set1.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(set1);
	}
}
