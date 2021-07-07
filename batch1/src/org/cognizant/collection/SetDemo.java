package org.cognizant.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> electronicSet=new TreeSet<String>();
				//LinkedHashSet<String>();
				//HashSet<String>();
		
		electronicSet.add("Fan");
		electronicSet.add("Bulb");
		electronicSet.add("Tubelight");
		electronicSet.add("Refrigeretaor");
		electronicSet.add("Bulb");
		electronicSet.add("Telivision");
		electronicSet.add("Tubelight");
		
		System.out.println(electronicSet);
		
		for (String string : electronicSet) {
			System.out.println(string);
		}
		
		System.out.println("using iterator ");
		
		Iterator<String> iterator = electronicSet.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
