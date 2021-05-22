package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

class Employee {

}

public class ListDemo1 {
	public static void main(String[] args) {
		int ar[] = new int[10];
		// ar[10]=99;

		// List list1=new List();
		List list1 = new ArrayList();

		list1.add(5445);
		list1.add("hello");

		list1.add(new Integer(5445));
		list1.add(5445.7887f);
		list1.add(new Employee());

		System.out.println(list1.get(0));
		System.out.println(list1.get(1));

		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + "  ");
		}

		list1.remove(1);
		list1.remove("hello");
		
		System.out.println();
		for (Object object : list1) {
			System.out.print(object+"  ");
		}

	}
}
