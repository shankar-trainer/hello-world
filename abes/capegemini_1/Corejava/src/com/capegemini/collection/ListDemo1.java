package com.capegemini.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		 List<String> language=new ArrayList<String>();
		 List<String> language1=new ArrayList<>();
		 
		 language1.add("java");
		 language1.add("python");
		 language1.add("perl");
		 //language1.add(67788);
		 language1.add("ruby");
		 language1.add("php");
		 
		 System.out.println(language1.get(3));
		 
		 System.out.println("\nusing for loop");
		 
		 for (int i = 0; i <language1.size(); i++) {
			System.out.print(language1.get(i)+"  ");
		}
		 
		 System.out.println("\nusing for each  loop");
		 for (String string : language1) {
			System.out.print(string+"  ");
		}
		 
	}
	
}
