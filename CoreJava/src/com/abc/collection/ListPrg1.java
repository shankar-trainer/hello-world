package com.abc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPrg1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();

		list1.add("mumbai");
		list1.add("delhi");
		list1.add("bhuvneshwar");
		list1.add("hyderabad");
		list1.add("chennai");
		list1.add("amrawati");

		System.out.println(list1);
		Collections.sort(list1);

		System.out.println("after sorting ");
		System.out.println(list1);
		
		System.out.println("first element "+Collections.min(list1));
		System.out.println("last element "+Collections.max(list1));

		int pos = Collections.binarySearch(list1, "patna");
		if (pos >= 0)
			System.out.println("found ");
		else
			System.out.println("not found ");

		System.out.println(Collections.binarySearch(list1, "delhi") >= 0 ? "found" : "not found");

		Collections.shuffle(list1);
		System.out.println("after shuffle "+list1);
	}
}
