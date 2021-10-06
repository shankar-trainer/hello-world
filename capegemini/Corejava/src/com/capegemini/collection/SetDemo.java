package com.capegemini.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> city=new LinkedHashSet<String>();//ordered
		
				//TreeSet<String>(); // sorted
				//HashSet<String>(); //not ordered
		
		city.add("noida");
		city.add("delhi");
		city.add("gurgaon");
		city.add("ghaziabaad");
		city.add("noida");
		
		System.out.println(city);
		
		for (String string : city) {
			System.out.printf("\t%s", string);
		}
	}
}
