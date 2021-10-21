package com.cts.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class MapDemo4 {

	public static void main(String[] args) {
		
//		HashMap<Integer, Float> empSalary=new HashMap<Integer, Float>();
		Hashtable<Integer, Float> empSalary=new Hashtable<Integer, Float>();
	
		
		//empSalary.put(null, 788787.67f);
		empSalary.put(10001, 788787.67f);
	//	empSalary.put(1002, null);
		empSalary.put(1003, 566788.56f);

		System.out.println(empSalary);
		
	}
}
