package com.capegemini.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		ArrayList<String> language1 = new 
				ArrayList<>();

		language1.add("dotnet");
		language1.add("java");
		language1.add("python");
		language1.add("ruby");
		language1.add("php");
		language1.add("python");
		language1.add("java");

	List<String> list2=	
			Collections.unmodifiableList(language1);
		
	list2.add("iot");
	System.out.println(list2);
		
	}
}
