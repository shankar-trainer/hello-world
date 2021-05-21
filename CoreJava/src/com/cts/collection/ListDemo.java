package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

class Employee{
	
}
public class ListDemo {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add(new Integer(123));
		list.add(1333);
		list.add("chennai");
		list.add(new Employee());

		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		
	}
}
