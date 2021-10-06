package com.capegemini.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

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

		System.out.println(language1);
		Collections.sort(language1);
		
		System.out.println(language1);
		
		int pos=Collections.binarySearch(language1, "java");
		if(pos>=0)
			System.out.println("found at "+pos);
		else
			System.out.println("not found  ");
		
	String s=	Collections.max(language1);
	System.out.println("max "+s);	
	System.out.println("min "+Collections.min(language1));	
	Collections.shuffle(language1);
		System.out.println("after shuffle "+language1);

		int res1=Collections.frequency(language1,"java");
	System.out.println("java freqeuncy "+res1);
	
  	Collections.reverse(language1);
  	System.out.println("reverse "+language1);
  	
  	Collections.swap(language1,1,4);
  	System.out.println("after swap "+language1);
	}
}
