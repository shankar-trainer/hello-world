package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ListPrg1 {

	public static void main(String[] args) {
		
		Collection collection=new ArrayList();
		collection.add(1234);
		collection.add(new Integer(1234));
		collection.add(45000.0f);
		collection.add("greater noida");
		System.out.println(collection);
		System.out.println(collection.contains(1234));
		System.out.println(collection.isEmpty());
		collection.remove(45000.0f);
		System.out.println(collection);
		collection.clear();// remove all elements 
		System.out.println(collection);
		
		
	}
}
