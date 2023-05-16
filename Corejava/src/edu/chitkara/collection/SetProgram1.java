package edu.chitkara.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProgram1 {

	public static void main(String[] args) {
		
		Set<String> stateSet=new HashSet<String>();
		stateSet.add("punjab");
		stateSet.add("haryana");
		stateSet.add("delhi");
		stateSet.add("up");
		stateSet.add("punjab");
		
		System.out.println(stateSet);
		
		Iterator<String> iterator = stateSet.iterator();
	    
		while(iterator.hasNext())
			System.out.println(iterator.next());

		
	}
}
