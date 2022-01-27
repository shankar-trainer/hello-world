package edu.lpu.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrg1 {

	public static void main(String[] args) {
		
		LinkedList<Integer>  list1=new  LinkedList<>();
		
		list1.add(1);// add at end position
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list1.addFirst(0);
		System.out.println(list1);
		list1.remove();// remove from head/first position
		System.out.println(list1);
		list1.removeLast();
		System.out.println(list1);
		
		Iterator<Integer> iterator = list1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		     iterator.remove();
		  }
		System.out.println(list1);
	}                                             
}
