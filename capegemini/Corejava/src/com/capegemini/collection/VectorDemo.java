package com.capegemini.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Integer> number = new Vector<>();
		Vector<Integer> number1 = new Vector<>();
		
		System.out.println(number1.size()+"  "+number1.capacity());
		
		for (int i = 0; i <=8; i++) {
			number1.add(i);
		}
		System.out.println(number1.size()+"  "+number1.capacity());
		
		number1.add(888);
		number1.add(888);
		
		System.out.println(number1.size()+"  "+number1.capacity());
		
	
		

	}
}
