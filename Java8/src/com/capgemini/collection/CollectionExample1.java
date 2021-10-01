package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample1 {
	static class Employee {
		@Override
		public String toString() {
			return "Employee Class";
		}
	}

	public static void main(String[] args) {
		List list1 = new ArrayList();

		list1.add(new Integer(667676));
		list1.add(565565);// auto boxing
		list1.add("delhi");
		list1.add(780000.00f);
		list1.add(true);
		list1.add("hello");
		list1.add(new Employee());

		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.contains("delhi"));
		System.out.println(list1.contains("noida"));

		//Collections.sort(list1);// error 
		
		list1.remove(2);
		list1.remove("hello");

		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + "  , ");
		}

		System.out.println("\nfor each loop");

		for (Object object : list1) {
			System.out.println(object);
		}
	}
}
