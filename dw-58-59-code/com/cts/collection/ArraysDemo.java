package com.cts.collection;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 1001, 10, 20, 3, 45 };
		int arr2[] = { 1, 2, 1001, 10, 20, 3, 45 };

		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.toString(arr1));

		Arrays.parallelSort(arr1);
		//Arrays.sort(arr1);
		
		System.out.println("sorted");
		System.out.println(Arrays.toString(arr1));

		int pos = Arrays.binarySearch(arr1, 10);
		if (pos >= 0)
			System.out.println("found at " + pos);
		else
			System.out.println("not found");
		
		

	}
}
