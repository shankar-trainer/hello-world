package com.coforge.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {

	public static void main(String[] args) {
		Set<String> citySet1=new  LinkedHashSet<>();//proper order
				
				//TreeSet<>();// sort all elements
				//HashSet<>();
		
		citySet1.add("new delhi"); 
		citySet1.add("noida");
		citySet1.add("new delhi");
		citySet1.add("aagra");
		citySet1.add("mathura");
		System.out.println(citySet1);
		System.out.println(citySet1.contains("noida"));
		
		citySet1.remove("aagra");
		
		Set<String> citySet2=new HashSet<>();
		citySet2.add("chennai");
		citySet2.add("madurai");
		citySet2.add("kanchipuram");
		citySet2.add("mahabalipuram");
		citySet2.add("kanyakumari");
		
		citySet1.addAll(citySet2);
		
		Iterator<String> iterator = citySet1.iterator();
		 while(iterator.hasNext())
			 System.out.println(iterator.next());
		
		 citySet1.removeAll(citySet2); 
		 
		 System.out.println("using for each ");
		 for(String s:citySet1)
			 System.out.print(s+", ");
		 
	}
}
