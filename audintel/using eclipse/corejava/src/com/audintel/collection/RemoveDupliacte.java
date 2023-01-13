package com.audintel.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDupliacte {

	public static void main(String[] args) {
		
		int arr[]= {11,2,3,4,5,11,2,89,67,77,7,8,9,2,6,};
		//remove the duplicates 
		
		Set<Integer> set1=new HashSet<>();
		for (Integer integer : arr) {
			set1.add(integer);
		}
		System.out.println(set1);
	}
}
