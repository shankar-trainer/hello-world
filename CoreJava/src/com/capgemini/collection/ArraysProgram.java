package com.capgemini.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysProgram {

	public static void main(String[] args) {
		Integer ar[]= {11,22,1,2,0,6,5,4};
		Integer ar1[]= {11,22,1,2,0,6,5,4};
		
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		
		int binarySearch = Arrays.binarySearch(ar, 5);
		
		System.out.println("search found at "+binarySearch);
		
		List<Integer> asList = Arrays.asList(ar);
		
		System.out.println(asList);
	}
}
