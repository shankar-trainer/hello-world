package com.montran.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrg1 {

	public static void main(String[] args) {

		LinkedList<String> languages = new LinkedList<>();

		languages.add("java");
		languages.add("python");
		languages.add("perl");
		languages.add("php");

		System.out.println(languages);
		languages.addFirst("nodejs");
		languages.addLast("mysql");
		System.out.println(languages);

		languages.add("perl");

		languages.remove();// remove head/first
		languages.removeFirst();
		// languages.removeFirstOccurrence("perl");
		System.out.println(languages);
		languages.removeLastOccurrence("perl");
		System.out.println(languages);

		//Iterable<Integer> it;

		Iterator<String> iterator = languages.iterator();

		System.out.println("using iterator\n");
		
		while (iterator.hasNext()) {
			String s=iterator.next();
			System.out.println(s);
			if(s.equals("php"))
				iterator.remove();
		}
		System.out.println(languages);
	}
}
