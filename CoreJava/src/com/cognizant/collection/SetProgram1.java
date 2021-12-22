package com.cognizant.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram1 {

	public static void main(String[] args) {
		Set<String> cityList = new
				//LinkedHashSet<>();// ordered
				// TreeSet<>();// sorted not ordered
				HashSet<>();  // not ordered
		cityList.add("delhi");
		cityList.add("noida");
		cityList.add("delhi");
		cityList.add("chennai");
		cityList.add("gurgaon");
		cityList.add("kolkotta");
		cityList.add("chennai");

		System.out.println(cityList);

		Iterator<String> iterator = cityList.iterator();
		
		System.out.println("using iterator");
		
		while (iterator.hasNext()) {
			String s=iterator.next();
			if (s.equals("delhi"))
				iterator.remove();
			else
			System.out.println("\t"+s);
		}
		System.out.println("----------");
		System.out.println(cityList);

		
		System.out.println("using for each ");
	
		  for(String s:cityList) {
			  System.out.println(s);
		  }
	
		
	}
}
