package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
static class Hello{}
	public static void main(String[] args) {
		List list1=new ArrayList();
		list1.add("hello");
		list1.add(new Integer(1234));
		list1.add(8999);// auto boxing  -- primitive --> object
		list1.add(new Hello());
		
		System.out.println(list1);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		System.out.println("\nfor loop \n");
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}
