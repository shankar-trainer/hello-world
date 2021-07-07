package com.cts.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> electricproduct_set = new TreeSet<String>();
		// LinkedHashSet<String>();// ordered
		// HashSet<String>(); // not ordered

		electricproduct_set.add("laptop");
		electricproduct_set.add("mobile");
		electricproduct_set.add("laptop");
		electricproduct_set.add("tv");
		electricproduct_set.add("geaser");
		electricproduct_set.add("refrigerator");

		System.out.println(electricproduct_set);

		for (String string : electricproduct_set) {
			System.out.println(string);
		}
		electricproduct_set.remove("geaser");
		System.out.println(electricproduct_set.contains("geaser"));

		System.out.println("using iterator");

		Iterator<String> it = electricproduct_set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
