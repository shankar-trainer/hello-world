package com.cts.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDEmo {

	public static void main(String[] args) {
		Set<String> set1=new TreeSet<String>();
				//LinkedHashSet<String>();   // ordered 
				//HashSet<String>(); // not ordered
		
		set1.add("python");
		set1.add("java");
		set1.add("python");
		set1.add("jython");
		set1.add("perl");
		set1.add("spring");
		set1.add("devops");
		set1.add("Spring Boot");
		System.out.println(set1);
		
		set1.remove("spring");
		
		Iterator<String> it=set1.iterator();

		while(it.hasNext())
			System.out.println(it.next());
		
		
	}
}
