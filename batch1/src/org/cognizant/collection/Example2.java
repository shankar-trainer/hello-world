package org.cognizant.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		//List<String> list1=new ArrayList<>();
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("chennai");
		list1.add("madurai");
		list1.add("ooty");
		list1.add("shivkashi");
		list1.add("kanchipuram");
		
		//list1.add(656565);
		System.out.println(list1);
		System.out.println("\nusing  for each loop\n");
		
		for (String string : list1) {
			System.out.println(string);
		}
		
		Iterable it ;
		
		Iterator<String> it1=list1.iterator();
		
		System.out.println("\nusing the iterator \n");
		while(it1.hasNext()) {
		  System.out.println(it1.next());
		}
		
		
	}
}
