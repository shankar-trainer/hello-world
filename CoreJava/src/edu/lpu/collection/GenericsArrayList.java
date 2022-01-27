package edu.lpu.collection;

import java.util.ArrayList;
import java.util.Collections;

public class GenericsArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		// list1.add(123);
		list1.add("delhi");
		list1.add("mumbai");
		list1.add("barodra");
		list1.add("jamshedpur");
		list1.add("chennai");

		System.out.println(list1);
		System.out.println(list1.contains("chennai"));

		Collections.sort(list1);
		System.out.println("After Sorting ");
		System.out.println(list1);

		list1.remove(0);
		list1.remove("barodra");
		System.out.println(list1);

		System.out.println("display all elements ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("display using for each  elements ");
		for (String string : list1) {
			System.out.println(string);
		}

		list1.clear();// remove all elements 
		System.out.println(list1);
	}
}
