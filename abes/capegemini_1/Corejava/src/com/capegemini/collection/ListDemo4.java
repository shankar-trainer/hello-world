package com.capegemini.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo4 {

	public static void main(String[] args) {
		String country[] = { "US", "UK", "IreLand", "India", "Srlanka", "Nepal" };

		ArrayList<String> countryList = new ArrayList<String>();

		for (String string : country) {
			countryList.add(string);
		}
		System.out.println(countryList);

		ListIterator<String> list1 = countryList.listIterator();

		while (list1.hasNext()) {
			String string = (String) list1.next();
			System.out.println(string);
		}
		System.out.println("In reverse direction");

		while (list1.hasPrevious()) {
			String string = (String) list1.previous();
			System.out.println(string);
		}
	}
}
