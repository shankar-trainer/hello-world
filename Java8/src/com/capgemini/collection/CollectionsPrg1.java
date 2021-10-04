package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsPrg1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(76);
		list1.add(766);
		list1.add(7);
		list1.add(766);
		list1.add(766);
		list1.add(66);
		list1.add(7);
		
		System.out.println("before  sorting "+list1);
		Collections.sort(list1);
		
		System.out.println("after sorting "+list1);
	
		int pos=Collections.binarySearch(list1, 888);
		System.out.println("position "+pos);
		if(pos>=0)
			System.out.println("found at "+pos);
		else 
		System.out.println("not found  ");

		System.out.println("frequency of 7 is  "+Collections.frequency(list1, 7));
		System.out.println("frequency of 766 is  "+Collections.frequency(list1, 766));
		
		System.out.println("max is  "+Collections.max(list1));
		System.out.println("min is  "+Collections.min(list1));
		
		
	}
}
