package com.capgemini.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*class StringReverseSort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//return o1.compareTo(o2);
		return o2.compareTo(o1);
	}
}
*/
public class StringSorting {
	static class StringReverseSort implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			//return o1.compareTo(o2);
			return o2.compareTo(o1);
		}
	}
	
	public static void main(String[] args) {
		
		String name[]= {"sumit","amit","kavita","arvind"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		Arrays.sort(name,new StringReverseSort());
		System.out.println(Arrays.toString(name));
		
		System.out.println("=========================");
		
		List<String> asList = Arrays.asList(name);
		Collections.sort(asList);
		System.out.println(asList);
		
		Collections.sort(asList,new StringReverseSort());
		System.out.println(asList);
		
	}
}
