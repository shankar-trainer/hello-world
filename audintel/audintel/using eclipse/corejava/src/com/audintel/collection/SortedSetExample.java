package com.audintel.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
	
		SortedSet<String> language=new TreeSet<>();// no duplicate not ordered
		
		language.add("java");
		language.add("php");
		language.add("kotlin");
		language.add("dotnet");
		language.add("asp");
		language.add("kotlin");
		language.add("angular");
		language.add("react");
	  
	 System.out.println(language.first());
	 System.out.println(language.last());
	System.out.println(language); 
	 SortedSet<String> subSet = language.subSet("java", "php");
		 
	 System.out.println(subSet);
	 System.out.println(language.tailSet("dotnet"));// elements greater than 
	 System.out.println( language.headSet("php"));	// elements less than 
	
	 
	}
}
