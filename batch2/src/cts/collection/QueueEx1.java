package cts.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedList<Integer>();
		Queue<String> deque2=new PriorityQueue();
		queue1.add(1);
		queue1.add(2);
		queue1.add(3);
		queue1.add(4);
		System.out.println(queue1);
		
		queue1.poll();// remove and return head element 
		
		System.out.println(queue1);
		
		System.out.println(queue1.peek());// return no removal
		
		queue1.offer(123);
		
		System.out.println(queue1);
		
		Deque<String> deque1=new LinkedList<String>();
		
	}
}
