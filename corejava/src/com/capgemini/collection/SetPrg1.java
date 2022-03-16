package com.capgemini.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {

	public static void main(String[] args) {

		Set<String> languageSet = new 
				//TreeSet<>();// sorted elements
		HashSet<>(); //not ordered, not sorted
		languageSet.add("java");
		languageSet.add("ruby");
		languageSet.add("javascript");
		languageSet.add("javascript");
		languageSet.add("php");
		languageSet.add("javascript");
		languageSet.add("html");
		languageSet.add("java");
		languageSet.add("php");
		languageSet.add("html");

		System.out.println(languageSet);

		Iterator<String> it = languageSet.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println(languageSet.contains("java"));
		languageSet.remove("java");
		System.out.println(languageSet.contains("java"));

		System.out.println("using for each ");
		for (String string : languageSet) {
			System.out.println("\n" + string);
		}
	}
}
