package org.cognizant.collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector <Integer> productIdList=new Vector<Integer>();
		
		System.out.println("capacity "+productIdList.capacity());
		System.out.println("size "+productIdList.size());
		
		for (int i = 10001; i <=10011; i++) {
			productIdList.add(i);
		}
		
		System.out.println(productIdList);
		System.out.println("capacity "+productIdList.capacity());
		System.out.println("size "+productIdList.size());
	
	}
}
