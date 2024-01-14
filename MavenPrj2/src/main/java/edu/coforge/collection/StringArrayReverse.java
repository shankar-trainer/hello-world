package edu.coforge.collection;

import java.util.Arrays;
import java.util.Comparator;

class Reverse implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

public class StringArrayReverse {

	public static void main(String[] args) {
		
		String nm[]= {"suman kumar","aman kumar","ram kumar","anil kumar",	"sunil kumar"};
		
		System.out.println("unsorted "+Arrays.toString(nm));
		
		Arrays.sort(nm);
		System.out.println("sorted "+Arrays.toString(nm));
		
		Arrays.sort(nm,new Reverse());
		System.out.println("sorted in reverse  "+Arrays.toString(nm));
	}
}
