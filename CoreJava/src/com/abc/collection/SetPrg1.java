package com.abc.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {

	public static void main(String[] args) {
		Set<String> citySet=new LinkedHashSet<>();//ordered , no duplicate , no index  
				//TreeSet<>(); //not ordered , no duplicate , no index  sorted
				//HashSet<>(); // not ordered , no duplicate , no index
		citySet.add("mumbai");
		citySet.add("pune");
		citySet.add("nagpur");
		citySet.add("sholapur");
		citySet.add("pune");
		citySet.add("banglore");
		
		System.out.println(citySet);
		
		Iterator<String> iterator = citySet.iterator();
		  // Iterator interface for traversing elements  in forward direction 
		//Iterator interface object get by List and Set iterator() method 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		// iterator.remove();
		}
		
		
		System.out.println(citySet);
				for(String s:citySet)
		System.out.println("\t"+s);
		
	}
}
