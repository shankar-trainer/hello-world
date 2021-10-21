package com.capegemini.collection;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int ar1[]={31,1,22,44,607};
		int ar2[]={31,1,22,44,607};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println("not sorted "+Arrays.toString(ar1));
		
		Arrays.sort(ar1);
		System.out.println("sorted "+Arrays.toString(ar1));
	
      int pos=Arrays.binarySearch(ar1,33);
      if(pos>=0)
    	  System.out.println("found at "+pos +" position ");
      else
      System.out.println("not found ");
	}
}
