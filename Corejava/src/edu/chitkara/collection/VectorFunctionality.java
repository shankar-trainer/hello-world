package edu.chitkara.collection;

import java.util.Random;
import java.util.Vector;

public class VectorFunctionality {

	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector<Integer>();
		System.out.println("initial size "+vector.size());
		System.out.println("initial capacity "+vector.capacity());
	    
		for (int i = 1; i <=10; i++) {
	        vector.add(new Random().nextInt())	;	
		}
		//vector.add(1111);
		System.out.println("now size "+vector.size());
		System.out.println("now  capacity "+vector.capacity());
			
	}
}
