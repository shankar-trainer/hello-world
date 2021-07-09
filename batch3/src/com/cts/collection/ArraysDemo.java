package com.cts.collection;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int ar[] = { 11, 2, 3, 1, 4, 5, 0 };
		int ar1[] = { 11, 2, 3, 1, 4, 5, 0 };

		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.equals(ar, ar1));
		Arrays.sort(ar);
		System.out.println("sorted array");
		System.out.println(Arrays.toString(ar));
		
		int pos=Arrays.binarySearch(ar,4);
		if(pos>=0)
			System.out.println("found at "+pos+" position");
		else
			System.out.println("not found");
	}
}
