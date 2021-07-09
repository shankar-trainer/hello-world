package cts.collection;

import java.util.Stack;

public class StackPrg {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push(11);
		stack.push(12);
		
		System.out.println(stack);
	}
}
