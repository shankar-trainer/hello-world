package org.cognizant.collection;

import java.util.LinkedList;

public class LinkedListPrg1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("pizza");
		list.add("burger");
		list.add("pasta");
		list.add("chowmein");
		list.add("chicken biryani");
		
		System.out.println(list);
		
		list.addFirst("chikcen mughlai");
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
		
 	}
}
