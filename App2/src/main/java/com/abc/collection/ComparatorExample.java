package com.abc.collection;

import java.util.Arrays;
import java.util.Comparator;

class MySort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}

public class ComparatorExample {

	public static void main(String[] args) {

		String lang[] = { "urdu", "english", "tamil", "bengali", "telugu" };

		Arrays.sort(lang);
		System.out.println("sorted array ");
		System.out.println(Arrays.toString(lang));
		
		Arrays.sort(lang,new MySort());
		System.out.println("\nreverse sorted array ");
		System.out.println(Arrays.toString(lang));

	}
}
