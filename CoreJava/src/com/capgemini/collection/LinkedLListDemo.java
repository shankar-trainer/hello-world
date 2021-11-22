package com.capgemini.collection;

import java.util.LinkedList;

public class LinkedLListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.addFirst(99);
		
		System.out.println(list1);
		
		list1.add(5);
		list1.addLast(666);
		list1.add(6);
		list1.add(7);
		
		System.out.println(list1);
		
		list1.remove();//remove from top/first
		
		list1.removeFirst();
		list1.removeLast();
		
	}
}
