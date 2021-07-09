package com.cts.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDEmo {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(6767);
		list1.add(67);
		list1.add(6);
		list1.add(767);
		list1.add(2000);
		list1.add(1);
		
		System.out.println(list1);
		Collections.sort(list1);
		
		System.out.println(list1);
		
		System.out.println(Collections.binarySearch(list1, 67));
		
		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
		
		Collections.shuffle(list1);
		System.out.println(list1);
		
	}
}
