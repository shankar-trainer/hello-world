package cts.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {
		Set<String> bookset=new TreeSet<>();
				//HashSet<>();
		bookset.add("beginner java");
		bookset.add("java in action");
		bookset.add("java professional");
		bookset.add("beginner java");
		bookset.add("beginner java");
		bookset.add("java for dumnmies");
		bookset.add("beginner java");
		bookset.add("java for dumnmies");
		bookset.add("beginner java");
		
		System.out.println(bookset);
		
		// no for loop
		// no index , so no get method
		System.out.println("using for each");
		for (String string : bookset) {
			System.out.println(string);
		}
		
	}
}
