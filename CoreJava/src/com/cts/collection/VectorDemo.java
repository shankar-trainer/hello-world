package com.cts.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vector1=new Vector<Integer>();
		
		System.out.println(vector1.capacity());
		System.out.println(vector1.size());
		
		for (int i = 1; i <=10; i++) {
			vector1.add(8888);
		}
		
		System.out.println(vector1.capacity());
		System.out.println(vector1.size());
		
		vector1.add(8888);

		System.out.println(vector1.capacity());
		System.out.println(vector1.size());
	
		
	
	}
}
