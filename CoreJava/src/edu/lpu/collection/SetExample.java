package edu.lpu.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> platform_set=new  LinkedHashSet<>();// ordered 
				//TreeSet<>(); //sorted 
				//HashSet<>(); // not ordered
		platform_set.add("window 10");
		platform_set.add("unix");
		platform_set.add("ubuntu");
		platform_set.add("red hat");
		platform_set.add("mac os");
		platform_set.add("os 400");
		platform_set.add("unix");
		platform_set.add("ubuntu");
		
		System.out.println(platform_set);
		
		System.out.println("\nusing for each \n");
		
		for (String string : platform_set) {
		   System.out.println(string);	
		}
		System.out.println("\nusing iterator  \n");
		
		Iterator<String> iterator = platform_set.iterator();
		
		//for (;iterator.hasNext();)
			while (iterator.hasNext())
		{
			System.out.println( iterator.next());
			
		}
	}
}
