package com.capegemini.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
	
		Queue<Integer> queue=new 
				//PriorityQueue<Integer>();
				LinkedList<Integer>();
		queue.offer(123);
		queue.offer(100);
		queue.offer(600);
		queue.offer(800);
		
		System.out.println("  queue FIFO");
		
		while(!queue.isEmpty())
		   //System.out.println(queue.poll());
			System.out.println(queue.peek());
		
		System.out.println(queue);
	}
}
