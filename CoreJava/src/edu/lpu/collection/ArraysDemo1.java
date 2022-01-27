package edu.lpu.collection;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		int ar[]=new int[10];
		Arrays.fill(ar, 100);

		System.out.println(Arrays.toString(ar));
		
		int ar1[]= {111,1,22,3,4,2,77,100};
		int ar2[]= {111,1,22,3,4,2,77,100};
		
		System.out.println("ar1 == ar2 "+Arrays.equals(ar1, ar2));
		
		System.out.println(Arrays.toString(ar1));
		
		Arrays.sort(ar1);
		System.out.println("ar1 == ar2 "+Arrays.equals(ar1, ar2));
		System.out.println("sorted");
		System.out.println(Arrays.toString(ar1));
		
		int pos = Arrays.binarySearch(ar1, 22);
		if(pos>=0)
			System.out.println("found at "+pos+"  position ");
		else
			System.out.println("not found");
	}                               
}
