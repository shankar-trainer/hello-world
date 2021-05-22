package com.cts.collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo4 {

	public static void main(String[] args) {
		ArrayList<String> language = new ArrayList<>();
		language.add("php");
		language.add("python");
		language.add("ruby");
		language.add("R");
		language.add("java");
		language.add("R");
		language.add("javascript");
		
		
		ListIterator<String> listIterator = language.listIterator();
		
		System.out.println("top to bottom");
		
		while (listIterator.hasNext()) {
			System.out.println( listIterator.next());
		}

		System.out.println("bottom to top in reverse direction");
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}
}
