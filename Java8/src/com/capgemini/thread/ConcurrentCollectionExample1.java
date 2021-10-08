package com.capgemini.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentCollectionExample1 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		
		list1.add("java");
		list1.add("python");
		list1.add("php");
		list1.add("dotnet");
	
		Iterator<String> iterator = list1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			list1.add("nodejs");
			//java.util.ConcurrentModificationException
		}
		
	}
}
