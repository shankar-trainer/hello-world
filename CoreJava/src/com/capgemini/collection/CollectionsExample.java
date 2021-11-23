package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
	
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(11);
		list1.add(2);
		list1.add(30);
		list1.add(4);
		list1.add(13);
		
		System.out.println("Unsorted "+list1);
		
		Collections.sort(list1);
		
		System.out.println("Sorted "+list1);
		
		System.out.println("4 is present at "+Collections.binarySearch(list1,4));
		System.out.println("4 is present at "+Collections.max(list1));
		System.out.println("4 is present at "+Collections.min(list1));
		
		Collections.shuffle(list1);
		
		System.out.println("After Shuffle   "+list1);
	}
}
