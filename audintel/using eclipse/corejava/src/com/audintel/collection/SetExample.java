package com.audintel.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
	//	Set<String> language=new HashSet<>();// no duplicate not ordered
		//Set<String> language=new TreeSet<>();// no duplicate not ordered but sorted
		Set<String> language=new LinkedHashSet<>();// no duplicate  ordered
		
		language.add("java");
		language.add("php");
		language.add("kotlin");
		language.add("dotnet");
		language.add("asp");
		language.add("kotlin");
		language.add("angular");
		language.add("react");
		System.out.println(language);
	        
		System.out.println("\n using iterator ");
		for (Iterator<String> iterator = language.iterator(); iterator.hasNext();) {
			String string =  iterator.next();
			System.out.println(string);
		}
		 language.remove("react");
		 System.out.println("\n using for each \n ");
		
		for (String string : language) {
			System.out.println(string);
		}
	}
}
