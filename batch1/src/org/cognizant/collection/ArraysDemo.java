package org.cognizant.collection;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String names1[]= {"vijay kumar","suresh kumar","anand kumar","kamal kumar","jai kumar"};
		String names2[]= {"vijay kumar","suresh kumar","anand kumar","kamal kumar","jai kumar"};
		
		System.out.println("Unsorted values");
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1);
		
		System.out.println("Sorted values");
		System.out.println(Arrays.toString(names1));
		
		System.out.println("equals "+Arrays.equals(names1, names2));
		
		System.out.println(Arrays.binarySearch(names1, "anand kumar"));
		
	}
}
