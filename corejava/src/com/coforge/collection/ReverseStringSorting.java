package com.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;

class StringSort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
//		return o1.compareTo(o2);
		return o2.compareTo(o1);
	}
}
public class ReverseStringSorting {

	public static void main(String[] args) {
		
		String ar1[]= {"book","pen","pencil","bag","water bottle","lunch box"};
		System.out.println(Arrays.toString(ar1));
	
		Arrays.sort(ar1);
		System.out.println(Arrays.toString(ar1));
		
		System.out.println("reverse order sorting");
		Arrays.sort(ar1,new StringSort());
		System.out.println(Arrays.toString(ar1));
		
	}
}
