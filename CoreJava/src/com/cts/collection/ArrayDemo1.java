package com.cts.collection;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int ar[] = { 11, 1, 2, 9, 4, 55 };
		int ar1[] = { 11, 1, 2, 9, 4, 55 };

		System.out.println(Arrays.equals(ar, ar1));

		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);

		System.out.println(Arrays.toString(ar));

		System.out.println(Arrays.binarySearch(ar, 4));

	}
}
