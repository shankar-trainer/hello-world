package edu.lpu.array;

import java.util.Arrays;

public class ArraysProgram2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 44, 55, 6, 7, 8, 9 };
		int arr1[] = { 1, 2, 3, 44, 55, 6, 7, 8, 9 };
		int arr2[] = { 1, 2, 3, 44, 55, 6, 7, 8, 88 };
		System.out.println(arr);

		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr, arr2));

		long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println("unsorted " + Arrays.toString(arr));
		
		long currentTimeMillis1 = System.currentTimeMillis();
		System.out.println("time in ms "+(currentTimeMillis1-currentTimeMillis));
		
		Arrays.sort(arr);
		System.out.println("sorted " + Arrays.toString(arr));

		System.out.println(Arrays.binarySearch(arr, 8));
		if (Arrays.binarySearch(arr, 8099000) >= 0)
			System.out.println(Arrays.binarySearch(arr, 8099000));
		else
			System.out.println("not found");
	}
}
