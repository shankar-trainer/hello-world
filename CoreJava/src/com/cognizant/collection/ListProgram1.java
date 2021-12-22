package com.cognizant.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.cognizant.error.Employee;

public class ListProgram1 {

	public static void main(String[] args) {
		
		Collection list2=new ArrayList();
		List list1=new ArrayList();
		
		Integer x=788787;// autoboxing
		
		list1.add(new Integer(899898));
		list1.add(7);
		list1.add("delhi");
		list1.add(new Float(777.77f));
		list1.add(new Employee());
		list1.add(7);
		list1.add("delhi");
		list1.add(67677.67f);// autoboxing 
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		list1.remove(0);   // remove using index
		list1.remove("delhi");// remove using object
		
		System.out.println(list1);
		
	    System.out.println("using for loop ");	
		for (int i = 0; i < list1.size(); i++) {
	      System.out.println(list1.get(i));		
		}
		System.out.println("using for each loop ");	
		 for(Object o:list1)
			 System.out.println(o);
	}
}
