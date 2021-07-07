package org.cognizant.collection;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List list1=new ArrayList();
		list1.add(66676776);
		list1.add("chennai");
		list1.add(12000.0f);
		
		
		for (int i = 0; i <list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("using for each ");
		for (Object object : list1) {
			System.out.println(object);
		}
	}
}
