package com.cts.collection;

import java.util.Vector;

public class VectorDEmo {

	public static void main(String[] args) {
		Vector<Float> salary=new Vector<Float>();
		salary.add(65658.0f);
		salary.add(56658.0f);
		salary.add(75658.0f);
		salary.add(23233.0f);
		salary.add(67888.0f);
		
		System.out.println(salary);
		
		Vector<Integer> vect1=new Vector<Integer>();
		
		System.out.println(vect1.size()+"  "+vect1.capacity());
		for (int i = 0; i <=9; i++) {
			vect1.add(i);
		}
		
		System.out.println(vect1.size()+"  "+vect1.capacity());
		
		vect1.add(666);
		System.out.println(vect1.size()+"  "+vect1.capacity());
		
	}
}
