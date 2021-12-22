package com.cognizant.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListProgram2 {

	public static void main(String[] args) {

		// List<Integer> list1=new ArrayList<>();
		// ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(80);
		list1.add(877881);
		list1.add(89);
		list1.add(8778812);
		list1.add(80);
		list1.add(877);
		list1.add(89);
		list1.add(80);
		list1.add(100);
		// list1.add(8788.565f);
		// list1.add("hello");
		System.out.println(list1);
		System.out.println(list1.contains(877887));
		System.out.println(list1.contains(8));

		for (Integer integer : list1)
			System.out.println(integer);

		Collections.sort(list1);
		System.out.println("sorted array  \n" + list1);

		int pos = Collections.binarySearch(list1, 877);
		if (pos >= 0)
			System.out.println("found at " + pos);
		else
			System.out.println("not found");

		System.out.println("max " + Collections.max(list1));
		System.out.println("min " + Collections.min(list1));

		Collections.shuffle(list1);

		System.out.println("after shuffle  "+list1);
		
		System.out.println("80 frequency in the list  "+Collections.frequency(list1,80));
		System.out.println("88 frequency in the list  "+Collections.frequency(list1,89));
	}
}
