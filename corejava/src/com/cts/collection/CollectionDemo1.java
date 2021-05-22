package com.cts.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
//		Set set1=new TreeSet(); 
		Set<Integer> set1=new TreeSet<>(); 
				//HashSet();
		
		set1.add(123);
		set1.add(12);
		set1.add(1);
		set1.add(101);
	
	//	set1.add("abc");
		
		System.out.println(set1);
		
	}
}
