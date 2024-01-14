package edu.coforge.collection;

import java.util.LinkedList;

public class ListPrg3 {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> list1=new LinkedList<>();
		
		list1.add(111); // add at end
		list1.add(112);
		list1.add(113);
	
		System.out.println(list1);
		
		list1.addFirst(99);
		System.out.println(list1);

		Integer remove = list1.remove();// retrieve and remove from head
		
		System.out.println(remove);
		System.out.println(list1.remove());
		System.out.println(list1.remove(111)); // remove using object
		
		System.out.println(list1.removeLast());
		
		
	}
}
