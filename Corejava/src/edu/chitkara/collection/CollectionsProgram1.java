package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsProgram1 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("birds");
		list1.add("flower");
		list1.add("animal");
		list1.add("insects");
		list1.add("land");
		list1.add("agriculture");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));

		int binarySearch = Collections.binarySearch(list1, "flower");
		if(binarySearch>=0)
			System.out.println("found at "+binarySearch);
		else
			System.out.println("not found ");
			

	}
}
