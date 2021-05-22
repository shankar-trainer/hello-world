package com.cts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(546);
		list1.add(54);
		list1.add(46);
		list1.add(16);
		list1.add(50);
		list1.add(16);
		
		Collections.sort(list1);

		System.out.println(list1);

		System.out.println(Collections.binarySearch(list1, 16));

		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
		
		Collections.shuffle(list1);
		
		System.out.println(list1);
		
		Collections.reverse(list1);
		System.out.println(list1);
		

	}
}
