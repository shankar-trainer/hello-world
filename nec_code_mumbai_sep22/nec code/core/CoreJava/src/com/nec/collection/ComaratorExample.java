package com.nec.collection;

import java.util.Arrays;
import java.util.Comparator;

class ReverseString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
//		return o1.compareTo(o2);
		return o2.compareTo(o1);
	}
	
}

public class ComaratorExample {
	
	public static void main(String[] args) {
		String name[] = { "suresh kumar", "priyansh kumar", "javed akhtar", "salim khan" ,"amresh kumar","diwkar choudhary" };
		
		System.out.println("without sorting names are \n");
		System.out.println(Arrays.toString(name));
		Arrays.sort(name,new ReverseString());
		System.out.println("without sorting names are \n");
		System.out.println(Arrays.toString(name));
	}
}
