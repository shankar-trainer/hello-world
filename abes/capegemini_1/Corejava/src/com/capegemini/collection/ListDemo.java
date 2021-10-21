package com.capegemini.collection;

import java.util.ArrayList;
import java.util.List;
class  Employee{
	int id;
	String name;
}
public class ListDemo {

	public static void main(String[] args) {
		List list1=new ArrayList();
		
		list1.add("hello");
		list1.add(new Integer(333));
		list1.add(new Customer());
		list1.add(65655.56f);
		
		System.out.println(list1);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(3));
		System.out.println(list1.contains("hello"));
		list1.remove(3);
		System.out.println(list1);
	}
	
}
