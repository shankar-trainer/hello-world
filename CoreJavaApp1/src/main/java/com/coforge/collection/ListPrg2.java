package com.coforge.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrg2 {

	public static void main(String[] args) {
		// Collection<String> collection=new ArrayList<>();
		List<String> collection = new ArrayList<>();
		collection.add("hello");
		// collection.add(1234);
		collection.add("greeting");
		collection.add("welcome");
		collection.add("good morning");
		collection.add("greeting");

		System.out.println(collection);
		System.out.println(collection.get(0));
		System.out.println(collection.get(1));
		System.out.println("using for loop");
		
		collection.remove(2);
		collection.remove("hello");
		

		for (int i = 0; i < collection.size(); i++)
			System.out.print(collection.get(i) + ", ");

		System.out.println("\n\nusing for each loop");
		for (String string : collection)
			System.out.print(string + ", ");

		System.out.println("using iterator ");

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("greeting"))
				iterator.remove();

			System.out.println(next);
		}
		System.out.println(collection);

	}
}
