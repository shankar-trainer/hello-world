package com.abc.collection;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int ar[]= {22,3,4,1,6,2};
		String lang[]= {"urdu","english","tamil","bengali","telugu"}; 
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar);
		//Integer x;
		
		System.out.println("sorted array ");
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(lang);
		
		System.out.println(Arrays.toString(lang));
		
	}
	
}
