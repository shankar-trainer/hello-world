package com.audintel.collection;

import java.util.Arrays;
import java.util.Comparator;

class StringReverse implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
public class StringReverseSorting {

	public static void main(String[] args) {
		
		String names[]= {"ram kumar","krishna kumar","aman kumar","subham kumar","pushpendra kumar"};
		System.out.println("without sorting names are "+Arrays.toString(names));

		Arrays.sort(names);
		System.out.println("with sorting names are "+Arrays.toString(names));
		Arrays.sort(names,new StringReverse());
		
		System.out.println("with sorting in descending order of  names "+Arrays.toString(names));
		
	}
}
