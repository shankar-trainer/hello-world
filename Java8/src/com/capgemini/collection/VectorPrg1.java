package com.capgemini.collection;

import java.util.Vector;

public class VectorPrg1 {

	public static void main(String[] args) {
		Vector<Integer> vect=new Vector<>();
				
		System.out.println(vect.capacity());// by default capacity is 10
		System.out.println(vect.size());
		
		for (int i = 0; i <11; i++) {
			vect.add(i);// after reaching threshold it will double its capacity
		}
		
		System.out.println(vect.capacity());
		System.out.println(vect.size());
		
		
	}
}
