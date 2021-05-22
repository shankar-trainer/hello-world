package com.cts.collection;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int ar[]= {1,2,3,4,5,1,2};
		
		Set<Integer> set1=new HashSet<Integer>();
		
		for (Integer integer : ar) {
			set1.add(integer);
		}
		
		
		System.out.println(set1);
		
	}
}
