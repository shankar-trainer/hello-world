package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListExample4 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(6);
		list1.add(7);
		list1.add(9);

		ListIterator<Integer> listIterator = list1.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("using for loop with iterator ");

		listIterator = list1.listIterator();
		for (; listIterator.hasNext();) {
			System.out.println(listIterator.next());

		}
		System.out.println("iterate from  last to first ");
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}
}
