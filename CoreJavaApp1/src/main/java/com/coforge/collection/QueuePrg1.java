package com.coforge.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePrg1 {

	public static void main(String[] args) {
		
		Queue<Integer> queue1=new LinkedList<>();
		
		for (int i = 10; i <=100; i=i+10) {
			queue1.add(i);
		}
		
		//queue1.peek();//  retrieve, return head or null if empty but not remove
		//queue1.element();//retrieve, return  head or throw exception if empty 
		                 // but not remove
		
		System.out.println(queue1);
		System.out.println(queue1.element());
		System.out.println(queue1.element());
		
		System.out.println(queue1);
  
		for (Integer integer : queue1) {
			System.out.print(integer+",");
		}
		
		System.out.println("  ");
		
		while(!queue1.isEmpty()) {
			System.out.print(queue1.remove()+",");// remove from head
		}
		
		System.out.println();
		System.out.println(queue1);
		
	}
}
