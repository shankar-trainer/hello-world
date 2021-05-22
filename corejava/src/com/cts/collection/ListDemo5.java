package com.cts.collection;

import java.util.LinkedList;
import java.util.List;

public class ListDemo5 {

	public static void main(String[] args) {
		//List<Float> salaryList=new LinkedList<>();
		LinkedList<Float> salaryList=new LinkedList<>();
	
		salaryList.add(10000.0f);
		salaryList.add(12000.0f);		
		
		salaryList.add(15000.0f);
		salaryList.addLast(25000.0f);

		salaryList.add(20000.0f);

		salaryList.addFirst(8000.0f);
		
		System.out.println(salaryList);
		
		salaryList.remove();
		salaryList.removeFirst();
		
		
	}
}
