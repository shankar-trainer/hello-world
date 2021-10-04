package com.capgemini.collection;

import java.util.Arrays;
import java.util.Comparator;

class StringReverseSort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//return o1.compareTo(o2);
		return o2.compareTo(o1);
	}
}
public class StringSorting {
	
	public static void main(String[] args) {
		
		String name[]= {"sumit","amit","kavita","arvind"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		Arrays.sort(name,new StringReverseSort());
		System.out.println(Arrays.toString(name));
		
	}
}
