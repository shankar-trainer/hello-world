package com.audintel.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPrg2 {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();

		list1.add("java");
		list1.add("php");
		list1.add("java script");
		list1.add("java");
		list1.add("react");
		list1.add("angular");
		list1.add("react");
		// list1.add(56565);

		System.out.println(list1);

		for (String string : list1) {
			System.out.println(string);
		}
		System.out.println(list1.contains("java"));

		List<String> list2 = new ArrayList<>();
		list2.add("vue js");
		list2.add("bone js");
		list2.add("node js");
		list2.add("jasmine");
		list2.add("android");
		list2.add("jasmine");

		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(list1.containsAll(list2));
		list1.removeAll(list2);
	}
}
