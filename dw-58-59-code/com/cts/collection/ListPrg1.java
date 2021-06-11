package com.cts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListPrg1 {

	public static void main(String[] args) {
		ArrayList<String> city1 = new ArrayList<>();

		city1.add("chennai");
		city1.add("maduirai");
		city1.add("banglore");
		city1.add("ooty");
		city1.add("hyderabad");

		System.out.println(city1);
		Iterator<String> it = city1.iterator();

		while (it.hasNext()) {
			//if (it.next().contentEquals("banglore"))
				//it.remove();
			//else
				System.out.println(it.next());
		}
		System.out.println(city1);

		ListIterator<String> it1 = city1.listIterator();
		System.out.println("listiterator in normal direction");
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("reverse direction");
		while (it1.hasPrevious())
			System.out.println(it1.previous());

	}
}
