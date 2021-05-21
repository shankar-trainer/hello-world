package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

import com.cts.inner.Myclass;

class MyClass implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

	
}

public class StringReversePrg1 {

	
	public static void main(String[] args) {
	
		String ar[]= {"mohan","ajay","vijay","rahul"};
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.toString(ar));
		
		Arrays.sort(ar,new  MyClass());
		
		System.out.println(Arrays.toString(ar));
		
		
	}
}
