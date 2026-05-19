package com.montran.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListPrg4 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("delhi");
		list1.add("chennai");
		list1.add("mumbai");
		list1.add("delhi");
		list1.add("indore");
		list1.add("coimbtore");

		ListIterator<String> listIterator = list1.listIterator();

		System.out.println("top to bottom");
		while (listIterator.hasNext())
			System.out.println(listIterator.next());
		
		System.out.println("\n bottom to top ");
		while (listIterator.hasPrevious())
			System.out.println(listIterator.previous());

	}
}
