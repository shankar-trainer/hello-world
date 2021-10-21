package com.capegemini.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		 
		// List<String> language1=new ArrayList<>();
		 ArrayList<String> language1=new ArrayList<>();
		 
		 language1.add("java");
		 language1.add("python");
		 language1.add("perl");
		 
		 language1.add("ruby");
		 language1.add("php");
		 
		 List<String> language2=new ArrayList<>();
		 
		 language2.add("IOT");
		 language2.add("android");
		 language2.add("robotics");
		 language2.add("java");
		 language2.add("robotics");
		 language2.add("php");
		 
		 System.out.println(language1);
		 System.out.println(language2);
		 
		 System.out.println(language1.contains("java"));
		 
		 language1.addAll(language2);
		 
		 System.out.println(language1);
		 
		 System.out.println(language1.containsAll(language2));
		 language1.retainAll(language2);
		 
		 System.out.println(language1);
		  
	}
	
}
