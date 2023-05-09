package com.nec.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPrg {


	public static void main(String[] args) {
		
	//	List<Integer> list1=new LinkedList<>();
		LinkedList<Integer> list1=new LinkedList<>();
	  
		list1.add(88);
		list1.add(99);
		list1.add(111);
		
		list1.addFirst(77);
		System.out.println(list1);
		
		list1.remove();
		list1.removeFirst(); // remove and removeFirst are same 
		System.out.println(list1);
		
		
		
	}
}
