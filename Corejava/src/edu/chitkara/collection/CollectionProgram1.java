package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.Collection;

import pack1.Employee;

public class CollectionProgram1 {
	
	public static void main(String[] args) {
		Collection collection=new ArrayList();
		collection.add("hello");
		collection.add("hello");
		collection.add(new Integer(10000));
		collection.add(5545465);  // auto boxing 
		collection.add(new Employee());
		collection.add(new Float(4546.56665f));
		collection.add(90000.56665f);
		
		System.out.println(collection);
		System.out.println(collection.contains("hello"));
		System.out.println(collection.contains("hello1"));
		
	}
	
}
