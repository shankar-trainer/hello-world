package edu.coforge.collection;

import java.util.Arrays;

public class ArraysPrg1 {

	public static void main(String[] args) {
		
		int ar1[]= {11,2,1,3,4,9,8,6};
		int ar2[]= {11,2,1,3,4,9,8,6};
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.equals(ar1,ar2));
		
		Arrays.sort(ar1);
		
		System.out.println(Arrays.toString(ar1));
		
		System.out.println(Arrays.binarySearch(ar1, 3));
		
		int pos = Arrays.binarySearch(ar1, 110);
		if(pos>=0)
			System.out.println("found at "+pos);
		else 
			System.out.println("not found");
		
	}
}
