package com.cts.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysDEmo1 {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 11, 9, 7, 4 };
		
		int ar1[] = { 1, 2, 3, 11, 9, 7, 4 };
		
		System.out.println(Arrays.equals(ar1, ar));
		System.out.println(Arrays.toString(ar));

		//Arrays.sort(ar);// quicksort
		Arrays.parallelSort(ar);// sort and merge

		System.out.println(Arrays.toString(ar));

		int pos = Arrays.binarySearch(ar, 7);

		if (pos >= 0)
			System.out.println("found at " + pos);
		
		List<int[]> asList = Arrays.asList(ar1);

		
		
		
	}
}
