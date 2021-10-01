package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExampe2 {

	public static void main(String[] args) {
		List<String> citylist = new ArrayList<String>();
		List<String> citylist1 = new ArrayList<>();

		citylist1.add("delhi");
		// citylist1.add(5767676); // error
		citylist1.add("noida"); // add -- add element at last position
		citylist1.add("Noida"); // add -- add element at last position
		citylist1.add("aagra");
		citylist1.add("chennai");
		citylist1.add("madurai");
		citylist1.add("aagra");
		citylist1.add("Ooty");
		citylist1.add(0, "kanchipuram"); // add(index,element)-- add element at specific index

		System.out.println(citylist1);

		// list -- duplicate ordered index
		System.out.println(citylist1.get(0));

		Collections.sort(citylist1);

		System.out.println("\nsorted elements are \n");
		System.out.println(citylist1);

		// after sort binary search will work
		int position = Collections.binarySearch(citylist1, "chennai");

		if (position >= 0)
			System.out.println("found at " + position);
		else
			System.out.println("not found");

		System.out.println("Last Element " + Collections.max(citylist1));
		System.out.println("First Element " + Collections.min(citylist1));

		Collections.shuffle(citylist1);
		System.out.println("after shuffling ");
		System.out.println(citylist1);

	}
}
