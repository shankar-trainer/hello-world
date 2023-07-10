package com.coforge.collection;

import java.util.List;
import java.util.Vector;

public class VectorPrg1 {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		//List<Integer> vector=new Vector<>();
	
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		for (int i = 0; i <=9; i++) 
			vector.add(i+100);
		
		vector.add(900);
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
	
	}
}
