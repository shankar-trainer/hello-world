package com.capgemini.collection;

import java.util.Arrays;
import java.util.Comparator;

class StringReverseCompare implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
public class StringReverse {

	public static void main(String[] args) {

		String ar[] = { "java", "ruby", "php", "jython", "node", "react", "angular" };

		System.out.println("no sorting");
		System.out.println(Arrays.toString(ar));
		
		System.out.println("sorting");
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		System.out.println("sorting in reverse order ");
		Arrays.sort(ar,new StringReverseCompare());
		System.out.println(Arrays.toString(ar));
		
		
	}

}
