package com.coforge.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(0,999);
		
		list1.remove(0);
		System.out.println(list1);
	
		
		LinkedList<Integer>  list2=new LinkedList<>(list1);
		System.out.println(list2);
		list2.remove();// remove first element
		System.out.println(list2);
		
		list2.add(555); // add at end of the list
		list2.addFirst(333);
		System.out.println(list2);
		
		list2.removeLast();  
		System.out.println(list2);
	    // add add addLast  are same 	
		//remove  and removeFirst() are same 
		//removeLast-- remove last element
		//addFirst -- add element at First 
		
	
		
		
	}
}
