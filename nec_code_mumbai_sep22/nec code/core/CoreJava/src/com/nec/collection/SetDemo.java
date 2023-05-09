package com.nec.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set1=new HashSet<>();
		set1.add(99);
		set1.add(88);
		set1.add(99);
		set1.add(99);
		System.out.println(set1);
		                                 // no duplicate no index
		int ar[]= {11,2,3,4,3,11,10,3,5,6,2,3,4};
		
		Set<Integer> set2=new HashSet<>();
		
		for (Integer integer : ar) {
			set2.add(integer);
		}
		
		System.out.println(set2);
		Object ar1[]=set2.toArray();
		
		System.out.println("using for each");
		for (Integer i : set2) {
			 System.out.println(i);
		}
      
		  Iterator<Integer> iterator = set2.iterator();
		  System.out.println("using iterator");
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
			  iterator.remove();
		  }
		  System.out.println(set2);
	}
}
