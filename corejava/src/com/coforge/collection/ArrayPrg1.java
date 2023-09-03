package com.coforge.collection;

import java.util.Arrays;

public class ArrayPrg1 {

	public static void main(String[] args) {
		int ar1[]= {11,2,3,1,44,5,6,0};
		int ar2[]= {11,2,3,1,44,5,6,0};
		
		System.out.println(Arrays.toString(ar1));
		
		System.out.println(Arrays.equals(ar1, ar2));
		
		Arrays.sort(ar1);
		
		System.out.println(Arrays.toString(ar1));
		int pos=Arrays.binarySearch(ar1, 5);
		if(pos>=0)
			System.out.println("found at "+pos);
		else
			System.out.println("not found");
		
	}
}
