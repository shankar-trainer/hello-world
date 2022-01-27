package edu.lpu.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
 public static void main(String[] args) {
	
	 Set<String> languages=new  LinkedHashSet<>();//ordered
			 //TreeSet<>();// sorted
			 //HashSet<>();// not ordered
	 
	 languages.add("java");
	 languages.add("python");
	 languages.add("java");
	 languages.add("sql");
	 languages.add("nodejs");
	 languages.add("sql");
	 System.out.println(languages);
	 
	 System.out.println("elements using for each ");
	 
	 for (String string : languages) {
		System.out.println(string);
	}
	 languages.remove("sql");
	
	 System.out.println(languages);
     
	 Iterator<String> iterator = languages.iterator();
      while(iterator.hasNext())
    	  System.out.println(iterator.next());
 
 }
}
