package com.cts.collection;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> city_list=new LinkedList<String>();
		city_list.add("chennai");
		city_list.add("madurai");
		city_list.add("coimbtore");
		city_list.add("kanchipuram");
		
		System.out.println(city_list);
		city_list.addFirst("ooty");
		System.out.println(city_list);
		
		city_list.remove(); // remove from head 
		city_list.removeLast();
		System.out.println(city_list);
		
	}
}
