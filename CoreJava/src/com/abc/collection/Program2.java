package com.abc.collection;

import java.util.Vector;

public class Program2 {

	public static void main(String[] args) {
		Vector<Integer> collection1 = new Vector<>();
		
		System.out.println("size "+collection1.size());
		System.out.println("capacity "+collection1.capacity());
		
		for (int i = 0; i <=9; i++) {
			collection1.add(i);
		}
		
		System.out.println("after addition ");
		
		System.out.println("size "+collection1.size());
		System.out.println("capacity "+collection1.capacity());
		
		collection1.add(11);

		System.out.println("size "+collection1.size());
		System.out.println("capacity "+collection1.capacity());

	
		
	}
}
