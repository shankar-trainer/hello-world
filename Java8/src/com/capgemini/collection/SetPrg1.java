package com.capgemini.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {

	public static void main(String[] args) {
		Set<String> productset1 = new  LinkedHashSet<>();// ordered 
				//TreeSet<>();// sorted
				//HashSet<>();  // no order 
		// no duplicate
		// no index support not ordered
		productset1.add("trouser");
		productset1.add("book");
		productset1.add("rice");
		productset1.add("trouser");
		productset1.add("pizza");
		productset1.add("mustard oil");
		productset1.add("trouser");
		System.out.println(productset1);
		System.out.println(productset1.contains("trouser"));
		productset1.remove("rice");

		Iterator<String> iterator = productset1.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("\n using foreach  ");
		for (String string : productset1) {
			System.out.print(string + ", ");
		}

		productset1.clear(); // remove all elements
		System.out.println("is empty \n" + productset1.isEmpty());

	}
}
