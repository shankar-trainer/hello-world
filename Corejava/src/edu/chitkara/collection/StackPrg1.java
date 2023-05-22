package edu.chitkara.collection;

import java.util.Stack;

public class StackPrg1 {

	public static void main(String[] args) {
		
	 Stack<Integer> stack1=new Stack<Integer>();
	 stack1.push(1);
	 stack1.push(2);
	 stack1.push(3);
	 stack1.push(4);
	 System.out.println(stack1);
	 
	 System.out.println(stack1.pop());
	 System.out.println(stack1);
	 System.out.println(stack1.peek());
	 System.out.println(stack1.peek());

	 System.out.println(stack1.search(1));
	 System.out.println(stack1.search(10));
	 System.out.println(stack1.firstElement());
	 
	 for(Integer i:stack1)
		 System.out.println(i);
	 
	 
	 
	 
	 
	}
}
