package com.abc.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysPrg1 {

	public static void main(String[] args) {
		int ar[]= {11,2,1,44,22,10,3,4};
		int ar1[]= {11,2,1,44,22,10,3,4};
		
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		
		System.out.println("After sorting ");
		System.out.println(Arrays.toString(ar));
		
		int pos = Arrays.binarySearch(ar, 4);
		if(pos>=0)
			System.out.println("search elements found at "+pos);
		else 
			System.out.println("not found");
	
		
		List<int[]> asList = Arrays.asList(ar);
		
	}
}
