package edu.lpu.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> languages =new LinkedList<>();
		languages.add("java");
		languages.add("html");
		languages.add("javascript");
		languages.add("python");
		
		languages.addFirst("dotnet");
		
		System.out.println(languages);
		languages.remove(); //remove head element 
		
		System.out.println(languages);
		languages.removeLast();
		System.out.println(languages);
		
		
	}
}
