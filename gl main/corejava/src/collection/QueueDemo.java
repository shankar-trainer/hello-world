package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new PriorityQueue<>();
		Queue<Integer> queue1=new LinkedList<Integer>();
		
		queue.add(111);
		queue.add(22);
		queue.add(333);
		queue.add(40);
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
	}
}
