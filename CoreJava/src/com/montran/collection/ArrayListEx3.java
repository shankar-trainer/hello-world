package com.montran.collection;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("delhi");
		list1.add("chennai");
		list1.add("mumbai");
		list1.add("delhi");
		list1.add("indore");
		list1.add("coimbtore");

		System.out.println(list1);
		
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("chennai");
		list2.add("ooty");
		list2.add("madurai");
		list2.add("delhi");
		list2.add("shivkashi");
		list2.add("rameswaram");
		
		list1.addAll(list2); // addAll will add one collection into another collection
		
		System.out.println(list1);
		System.out.println(list1.containsAll(list2));// containsAll check if one collection is present in other collection
		
		//list1.clear();//  remove all elements 
		//list1.removeAll(list2);
		list1.retainAll(list2);
		System.out.println(list1);
	}
}
