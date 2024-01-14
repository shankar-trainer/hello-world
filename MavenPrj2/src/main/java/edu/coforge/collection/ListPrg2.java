package edu.coforge.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListPrg2 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("delhi");
		list1.add("kanpur");
		list1.add("bhopal");
		list1.add("chennai");
		list1.add("kolkotta");

		System.out.println(list1);
		// Collection -- interface
		// Collections -- utility class

		Collections.sort(list1);
		System.out.println(list1);

		int pos = Collections.binarySearch(list1, "chennai");
		if (pos >= 0)
			System.out.println("found at " + pos);
		else
			System.out.println("not found");

		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
		
		Collections.shuffle(list1);
		System.out.println(list1);
		
		Collection<String> unmodifiableCollection = 
				Collections.unmodifiableCollection(list1);
		
		//unmodifiableCollection.add("hello");
		
		
	}
}
