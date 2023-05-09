package com.nec.collection;

import java.util.Arrays;

public class ArraysDemo {

	
	public static void main(String[] args) {
		int ar1[]= {22,3,4,1,9,6,0,33};
		int ar2[]= {22,3,4,1,9,6,0,33};
		int ar3[]= {22,3,4,10,9,6,0,33};
		
		
		System.out.println("Array1 elemnts are "+Arrays.toString(ar1));
		System.out.println("Array2 elemnts are "+Arrays.toString(ar2));
		System.out.println("Array3 elemnts are "+Arrays.toString(ar3));
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		
		
		
		System.out.println("Array1 elemnts are "+Arrays.toString(ar1));
		
		Arrays.sort(ar1);
		
		System.out.println("Array1 elemnts after sorting are "+Arrays.toString(ar1));
		
		
		int pos=Arrays.binarySearch(ar1, 16);
		if(pos>=0)
			System.out.println("found at "+pos+"  position");
		else
			System.out.println("not found");
		
		
		
	}
}
