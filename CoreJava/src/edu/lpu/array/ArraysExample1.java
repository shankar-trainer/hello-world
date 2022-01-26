package edu.lpu.array;

import java.util.Arrays;

public class ArraysExample1 {

	public static void main(String[] args) {
		int arr1[] = new int[20];

		Arrays.fill(arr1, 100);
		int x=0;
		for (int i : arr1) {
			System.out.print(i + ",  ");
		  if(x%5==0)
			  System.out.println();
		}
	}
}
