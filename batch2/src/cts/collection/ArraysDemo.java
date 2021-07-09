package cts.collection;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int arr1[]= {1,10,2,3,44,5};
		int arr2[]= {1,10,2,3,44,5};

		System.out.println(Arrays.equals(arr1, arr2));
		
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
		
		int pos=Arrays.binarySearch(arr1, 3);
		
		if(pos>=0)
			System.out.println("found at "+pos);
		else
			System.out.println("not found");
		
	}
}
