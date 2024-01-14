package edu.coforge.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {

	
	public static void main(String[] args) {
		
		Set<String> languageSet=new  LinkedHashSet<>();
				//TreeSet<>();   // all elements are sorted
				// HashSet<>();
		// no duplicate 
		
		languageSet.add("java");
		languageSet.add("spring");
		languageSet.add("hibernate");
		languageSet.add("javascript");
		languageSet.add("java");
		languageSet.add("html");

		System.out.println(languageSet);
		
		System.out.println("using for each");
		for (String string : languageSet) 
			System.out.print(string+",");
		
		System.out.println("using iterator");
		
		Iterator<String> iterator = languageSet.iterator();
		
		while(iterator.hasNext()) {
			String s=iterator.next();
			System.out.println(s);
			if(s.equals("java"))
		    iterator.remove(); 
		}
		System.out.println(languageSet);
		
		Object[] array = languageSet.toArray();
		
		
	}
}
