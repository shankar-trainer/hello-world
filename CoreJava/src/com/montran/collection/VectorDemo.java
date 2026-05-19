package com.montran.collection;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> empId=new Vector<Integer>();
		System.out.println(empId.size());
		System.out.println(empId.capacity());
		
		for (int i = 0; i <=9; i++) {
			empId.add(new Random().nextInt());
		}

		empId.add(new Random().nextInt());
		
		System.out.println("after adding 11 element ");
		System.out.println(empId.size());
		System.out.println(empId.capacity());
		
	}
}
