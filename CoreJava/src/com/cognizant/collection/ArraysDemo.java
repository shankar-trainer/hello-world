package com.cognizant.collection;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		Integer i;
		
		String names[]= {"sumit","amit","babita","pritam","keshav","banbari"};
		
		System.out.println("unsorted");
		System.out.println(Arrays.toString(names));
    		
		System.out.println("sorted");
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		System.out.println(  Arrays.binarySearch(names, "sumit"));
		
		int arr1[]= {1,2,3,4,5};		
		int arr2[]= {1,2,3,4,5};		
		
		System.out.println(Arrays.equals(arr1, arr2));
		
	}
}
