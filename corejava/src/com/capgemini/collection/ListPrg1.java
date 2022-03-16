package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ListPrg1 {

	public static void main(String[] args) {
		
		//Collection list1=new ArrayList();
		
		//List list1=new ArrayList();//List is interface - ArrayList is concrete class of List interface
		ArrayList list1=new ArrayList();
		
		list1.add("hello");
		list1.add(new Integer(12000));
		list1.add(new Float(23456.67f));
		list1.add(1234);// auto boxing -- primitive to wrapper class
		list1.add(68899.45f);
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		list1.remove(0);
		System.out.println(list1);
		System.out.println(list1.contains("hello"));
		System.out.println(list1.contains(1234));
		
		
	}
}
