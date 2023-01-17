package com.abc.collection;

import java.util.LinkedList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
	   LinkedList<String> language =new LinkedList<>();
	   
	   language.add("java");
	   language.add("javascript");
	   language.add("python");
	   
	   language.add("react");// add element at last  
	   System.out.println(language);
	   
	   language.remove();// first element 
	   language.addFirst("react");
	   System.out.println(language);
	   language.removeLast();
	   System.out.println(language);
	}
	
}
