package com.montran.collection;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		int ar[] = { 33, 4, 2, 11, 2, 1 };
		int ar1[] = { 33, 4, 2, 11, 2, 1 };
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.equals(ar, ar1));

		Integer i;
		
		Arrays.sort(ar);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(ar));

		System.out.println(Arrays.binarySearch(ar, 4));
		System.out.println((Arrays.binarySearch(ar, 4)>=0?"found":"notfound"));
		System.out.println((Arrays.binarySearch(ar, 4999)>=0?"found":"notfound"));
		
		
	}
}
