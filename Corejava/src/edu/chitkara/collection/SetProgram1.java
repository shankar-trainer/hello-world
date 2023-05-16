package edu.chitkara.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgram1 {

	public static void main(String[] args) {
		
		Set<String> stateSet=new LinkedHashSet<String>(); 
				//TreeSet<String>();// sorted
				//HashSet<String>(); // not ordered
		stateSet.add("punjab");
		stateSet.add("haryana");
		stateSet.add("delhi");
		stateSet.add("up");
		stateSet.add("punjab");
		
		System.out.println(stateSet);
		
		Iterator<String> iterator = stateSet.iterator();
	    
		System.out.println("using iterator \n");
		while(iterator.hasNext())
			System.out.print(iterator.next()+", ");

		System.out.println("\nusing for each loop  \n");
               for (String string : stateSet) {
				System.out.print(string+", ");
			}		
	}
}
