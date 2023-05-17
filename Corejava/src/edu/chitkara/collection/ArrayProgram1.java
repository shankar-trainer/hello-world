package edu.chitkara.collection;

import java.util.Arrays;

public class ArrayProgram1 {

	public static void main(String[] args) {

		int ar1[] = { 11, 2, 3, 1, 44, 5, 6, 1 };
		int ar2[] = { 11, 2, 3, 1, 44, 5, 6, 1 };

		System.out.println(Arrays.equals(ar1, ar2));

		System.out.println("Unsorted array \n" + Arrays.toString(ar1));
		Arrays.sort(ar1);
		System.out.println("Sorted array \n" + Arrays.toString(ar1));

		int pos = Arrays.binarySearch(ar1, 3);
		if (pos >= 0)
			System.out.println("found at " + pos);
		else
			System.out.println("not found");
	}
}
