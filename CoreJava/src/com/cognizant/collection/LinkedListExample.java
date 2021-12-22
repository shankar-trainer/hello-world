package com.cognizant.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1=new LinkedList<>();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.addFirst(99);
		list1.addLast(10);
		
		System.out.println(list1);
		
		
		list1.remove();// remove from head/first
		System.out.println(list1);
		list1.removeLast();
		list1.removeFirst(); // same as of remove()
		
		System.out.println(list1);
		
	}
}
