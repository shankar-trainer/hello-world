package com.capgemini.collection;

import java.util.LinkedList;
import java.util.List;

public class ListPrg5 {

	public static void main(String[] args) {
		//List<String> language_list=new LinkedList<>();
		LinkedList<String> language_list=new LinkedList<>();
		
		language_list.add("java");// add at last
		language_list.add("php");
		language_list.add("dotnet");
		language_list.add("python");
		
		language_list.addFirst("nodejs");// add at first
		
		System.out.println(language_list);
		
		language_list.remove();// remove from head/first
		language_list.removeLast();// remove from last
		
		System.out.println(language_list);
	}
}
