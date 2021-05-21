package com.cts.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
	public static void main(String[] args) {

		Set<String> languages = new LinkedHashSet<String>();
				//TreeSet<String>();// sorted
		
				//HashSet<String>();// not ordered ,hashtable 
		languages.add("java");
		languages.add("nodejs");
		languages.add("ruby");
		languages.add("java");
		languages.add("angular");
		languages.add("react");

		System.out.println(languages);

/*		languages.remove("ruby");

		for (String string : languages) {
			System.out.println(string);
		}

		Iterator<String> it = languages.iterator();
		System.out.println("while loop");

		while (it.hasNext()) {
			String s = it.next();

			if (s.equals("java"))
				it.remove();
			else
				System.out.println(s);
		}

		System.out.println(languages);
		*/
	}
}
