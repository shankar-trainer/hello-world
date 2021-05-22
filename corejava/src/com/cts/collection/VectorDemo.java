package com.cts.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
//		List<String> language = new Vector<>();
		
		Vector<String> language = new Vector<>();
		
		System.out.println(language.capacity());
		System.out.println(language.size());

		language.add("php");
		// language.add(123);
		language.add("python");
		language.add("ruby");
		language.add("R");
		language.add("java");
		language.add("R");
		language.add("javascript");
		language.add("react");
		language.add("react");
		language.add("react");
		language.add("react");
		
		Enumeration<String> elements = language.elements();

		System.out.println("enumeration");
				while (elements.hasMoreElements()) {
			
			String string = elements.nextElement();
			System.out.println(string);
		}

		Iterator<String> iterator = language.iterator();
		System.out.println("iterator");
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.print(string+"  , ");
		    if(string.contentEquals("react"))
		    	iterator.remove();
		}
		
		System.out.println("after iterator ");
		System.out.println(language);

		System.out.println(language.capacity());
		System.out.println(language.size());

	}
}
