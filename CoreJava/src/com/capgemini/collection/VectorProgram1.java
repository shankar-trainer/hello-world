package com.capgemini.collection;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import com.capg.abstract1.BirthDay;

public class VectorProgram1 {

	public static void main(String[] args) {
		Collection list2 = new Vector();

		List list1 = new Vector();
		Vector list3 = new Vector();

		list1.add(76767); // autoboxing -- primitive int to object
		list1.add(new Integer(767));
		list1.add(767.78787f);
		list1.add(new BirthDay());
		list1.add("hello");

		System.out.println(list1);
		
		System.out.println("using for each ....");
		for (Object object : list1) {
		  System.out.println(object);	
		}

	}

}
