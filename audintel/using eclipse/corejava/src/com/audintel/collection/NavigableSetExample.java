package com.audintel.collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
	NavigableSet<String> language=new TreeSet<>();// no duplicate not ordered
		
		language.add("java");
		language.add("php");
		language.add("kotlin");
		language.add("dotnet");
		language.add("asp");
		language.add("kotlin");
		language.add("angular");
		language.add("react");
		System.out.println(language);
		
		System.out.println(language.descendingSet());
		System.out.println(language.higher("php"));
		System.out.println(language.lower("php"));
		System.out.println(language.floor("php"));
		
		String pollFirst = language.pollFirst();// retrieve and remove first element  
	  System.out.println(pollFirst);
	  System.out.println(language);
	}
}
