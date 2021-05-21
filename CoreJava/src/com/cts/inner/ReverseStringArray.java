package com.cts.inner;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseStringArray {

	public static void main(String[] args) {

		String food[] = { "pizza", "dosa", "idli", "fried rice", "momos" };

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};

		Arrays.sort(food, comparator);
		System.out.println(Arrays.toString(food));

		Comparator<String> comparator1=(String o1, String o2)-> o2.compareTo(o1);
		
		Arrays.sort(food, comparator1);
		System.out.println(Arrays.toString(food));
		
		Arrays.sort(food, (String o1, String o2)-> o2.compareTo(o1) );
		System.out.println(Arrays.toString(food));
		
		
	}
}
