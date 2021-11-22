package com.capgemini.collection;

import java.util.ArrayList;

public class ArrayListPrg2 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(3);
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println(list1);
		System.out.println(list2);

		list1.retainAll(list2);
		
		System.out.println("after retain all ");
		System.out.println(list1);
		
		System.out.println("after list1.addAll(list2)");
		
		list1.addAll(list2);

		System.out.println(list1);
		list1.retainAll(list2);
		
		System.out.println("after retain all ");
		System.out.println(list1);
	}
}
