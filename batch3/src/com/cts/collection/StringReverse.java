package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

class StringSortReverse implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
	   return o2.compareTo(o1);
	}
	
}

public class StringReverse {

	public static void main(String[] args) {
		String names[]= {"sita","geeta","meeta","kavita","lalita","babita"};
		
		Arrays.sort(names);
		
		System.out.println("Sorted Arrays "+Arrays.toString(names));
		
		Arrays.sort(names,new StringSortReverse());
		
		System.out.println("Reverse Sorted Arrays "+Arrays.toString(names));
		
	}
}
