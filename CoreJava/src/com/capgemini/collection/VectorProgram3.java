package com.capgemini.collection;

import java.util.Vector;

public class VectorProgram3 {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		
		System.out.println("capacity "+vector.capacity());
		System.out.println("size "+vector.size());
		
		for(int i=0;i<=9;i++) {
		vector.add(i);	
		}
		
		
		System.out.println("capacity "+vector.capacity());
		System.out.println("size "+vector.size());
		
		vector.add(7777);
		
		System.out.println("capacity "+vector.capacity());
		System.out.println("size "+vector.size());
		
	
	}
}
