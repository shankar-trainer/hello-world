package com.coforge.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {

	public static void main(String[] args) {
		Set<String> technologies=new LinkedHashSet<>();  //ordered
				//TreeSet<>();// sorted
				//HashSet<>();
		
		technologies.add("java");
		technologies.add("node");
		technologies.add("react");
		technologies.add("javascript");
		technologies.add("java");
		System.out.println(technologies);
		
		// no index support 
		
		System.out.println(technologies.contains("node"));
		System.out.println(technologies.contains("node js"));
		System.out.println(technologies.remove("abc"));
		System.out.println(technologies.remove("react"));
		
		Iterator<String> iterator = technologies.iterator();
		System.out.println("\nusing iterator \n");
		
		while(iterator.hasNext())
			System.out.println("\t"+iterator.next());
		
		System.out.println("\nusing for each \n");
		for (String string : technologies) {
			System.out.print(string+",  ");
		}
		
	}
}
