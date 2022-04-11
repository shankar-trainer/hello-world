package cts.collection.array;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		//Integer 
		int ar1[]= {11,22,3,0,0,15};
		int ar2[]= {11,22,3,0,0,15};
		
		System.out.println("equals "+Arrays.equals(ar1, ar2));
		
		System.out.println("array1 \n"+Arrays.toString(ar1));
		System.out.println("array2 \n"+Arrays.toString(ar2));
		
		Arrays.sort(ar1);
		System.out.println("sorted array1 \n"+Arrays.toString(ar1));
		
		System.out.println(Arrays.binarySearch(ar1, 0));
		
	}
}
