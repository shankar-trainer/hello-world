package org.cognizant.collection;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {

		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("chennai");
		list1.add("madurai");
		list1.add("ooty");
		list1.add("shivkashi");
		list1.add("kanchipuram");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("delhi");
		list2.add("noida");
		list2.add("ooty");
		list2.add("mathura");
		list2.add("chennai");
		list2.add("aagra");
		
		list1.addAll(list2);
		
		System.out.println(list1.contains("chennai"));
		System.out.println(list1.containsAll(list2));
		  
		System.out.println(list1);
		
		
		list1.remove(0);
		list1.remove("madurai");
		
		System.out.println(list1);
		
		list1.removeAll(list2);
		System.out.println(list1);
	}
}
