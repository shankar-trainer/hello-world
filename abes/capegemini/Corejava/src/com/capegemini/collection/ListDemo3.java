package com.capegemini.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {

		// List<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(8888);
		list1.addFirst(9999);
		list1.addFirst(7777);
		list1.addLast(5677);
		list1.addLast(5566);
		list1.addLast(5670);
		list1.add(2, 345);

		System.out.println(list1);
		list1.removeFirst();
		int p = list1.remove(1);

		Iterator<Integer> iterator = list1.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
	}
}
