package com.cts.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list1.addFirst(0);
		list1.addLast(888);
		
		System.out.println(list1);

		list1.removeFirst();
		list1.removeLast();
		
		System.out.println(list1);
		
		
	}
}
