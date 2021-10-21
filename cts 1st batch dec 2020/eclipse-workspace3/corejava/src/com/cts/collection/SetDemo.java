package com.cts.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> cities = new  LinkedHashSet<String>();// ordered 
				//TreeSet<String>();  // sorted
				//HashSet<>();   // not in order

		cities.add("delhi");
		cities.add("noida");
		cities.add("chennai");
		cities.add("hyderabad");
		cities.add("chennai");

		System.out.println(cities);

		cities.remove("delhi");
		
		System.err.println(cities.contains("delhi"));

		Iterator<String> it = cities.iterator();

		while (it.hasNext()) 
			System.out.println(it.next());

		System.out.println();
		
		for (String string : cities) {
			System.out.print(string+", ");
		}
	}
}
