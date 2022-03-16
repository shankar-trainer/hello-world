package com.capgemini.collection;

import java.util.Arrays;

public class ArraysPrg1 {
	Integer x;

	public static void main(String[] args) {
		int ar1[]= {1,12,3,4,15};
		int ar2[]= {1,12,3,4,15};
		
		System.out.println(Arrays.equals(ar1, ar2));
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		Arrays.sort(ar1);
		
		System.out.println("after sorting ");
		System.out.println(Arrays.toString(ar1));
		
		int pos=Arrays.binarySearch(ar1, 3);
		
		if(pos>=0)
		  System.out.println("found at "+pos);
		else
			System.out.println("not found");
			
	}
}
