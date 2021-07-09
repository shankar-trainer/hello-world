package cts.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {
		Set<String> sweets=new TreeSet<String>();
				//LinkedHashSet<String>();// orered 
				//HashSet<String>();// not ordered
		sweets.add("jalebi");
		sweets.add("rasogulla");
		sweets.add("laddu");
		sweets.add("jalebi");
		System.out.println(sweets);
		
		System.out.println("\nfor each \n");
		for (String string : sweets) {
			System.out.println("\t"+string);
		}
		sweets.remove("jalebi");
		System.out.println(sweets.contains("jalebi"));
		System.out.println("\n using iterator");
		Iterator<String> iterator = sweets.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}
