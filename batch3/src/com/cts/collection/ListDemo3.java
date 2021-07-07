package com.cts.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();

		list1.add("chennai");
		list1.add("madurai");
		list1.add("rameswaram");
		list1.add("kanyakumari");
		list1.add("shivkashi");

		ListIterator<String> listIterator = list1.listIterator();

		System.out.println("from top to bottom\n");
		while (listIterator.hasNext())
			System.out.println(listIterator.next());

		System.out.println("from  bottom to top \n");

		while (listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}
}
