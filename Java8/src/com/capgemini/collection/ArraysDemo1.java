package com.capgemini.collection;

import java.util.Arrays;

public class ArraysDemo1 {
	public static void main(String[] args) {
		int ar[] = { 101, 2, 3, 1, 100, 5, 9, 4 };
		int ar1[] = { 101, 2, 3, 1, 100, 5, 9, 4 };
	
		System.out.println(Arrays.equals(ar, ar1));
		
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.equals(ar, ar1));
		System.out.println(Arrays.toString(ar));
		
		/*int pos=Arrays.binarySearch(ar, 1);
		if(pos>=0)
			System.out.println("found at "+pos);
		else
			System.out.println("not found  ");
		*/
		//System.out.println(Arrays.binarySearch(ar, 1)>=0?"found ":"not found");
		System.out.println(Arrays.binarySearch(ar, 1)>=0?" found at "+Arrays.binarySearch(ar, 1)+" position":"not found");
		
		
		System.out.println(Arrays.toString(ar1));
		Arrays.fill(ar1, 999);
		System.out.println(Arrays.toString(ar1));
		
	}
}
