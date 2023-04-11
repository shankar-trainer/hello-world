package com.audintel.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		Integer ar[]= {1,2,3,4,5,6,7,8};
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int ar1[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.equals(arr, ar1));
		
		List<Integer> asList = Arrays.asList(ar);
		
		int ar2[]= {11,2,3,24,1,9,7,5};
		
		System.out.println("without sorting  "+Arrays.toString(ar2));
		
		Arrays.sort(ar2);
		
		System.out.println("after sorting  "+Arrays.toString(ar2));
		
		int pos=Arrays.binarySearch(ar2, 5);
	
		System.out.println(pos>=0?"found at "+pos:"not found");
		System.out.println(Arrays.binarySearch(ar2, 775)>=0?"found at "+pos:"not found");
		System.out.println(asList);
	}
}
