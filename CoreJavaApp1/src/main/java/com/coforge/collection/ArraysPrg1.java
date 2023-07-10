package com.coforge.collection;

import java.util.Arrays;

public class ArraysPrg1 {

	public static void main(String[] args) {
		int ar[]= {11,2,1,3,4,5,1};
		int ar1[]= {11,2,1,3,4,5,1};
		
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.equals(ar, ar1));
		
		Arrays.sort(ar);
		System.out.println(Arrays.equals(ar, ar1));
		
		System.out.println(Arrays.toString(ar));
		int binarySearch = Arrays.binarySearch(ar, 4);
		if(binarySearch>=0)
			System.out.println("found at "+binarySearch);
		else
			System.out.println("not found");
	}
}
