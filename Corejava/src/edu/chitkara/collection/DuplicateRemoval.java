package edu.chitkara.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoval {

	public static void main(String[] args) {
	
		int ar[]= {1,2,3,11,2,3,4,5,1,11};
		
		Set<Integer> set1=new HashSet<Integer>();
		
		for (Integer integer : ar) {
			set1.add(integer);
		}
		System.out.println(set1);
		
		
	}
}
