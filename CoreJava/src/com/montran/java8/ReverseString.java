package com.montran.java8;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseString {

	public static void main(String[] args) {
		String ar[] = { "hello", "greeting", "welcome", "good day", "all well" };

		/*
		 * Comparator<String> comparator=new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return o2.compareTo(o1);
		 * } };
		 */
		
		Comparator<String> comparator=(a1,a2)-> a2.compareTo(a1);
		
		Arrays.sort(ar,comparator);
		System.out.println(Arrays.toString(ar));

		Arrays.sort(ar,(a1,a2)-> a1.compareTo(a2));
		System.out.println(Arrays.toString(ar));
	}

}
