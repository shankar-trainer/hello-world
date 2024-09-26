package com.abc.collection;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		  String ar[]= {"delhi","noida","madurai","kanchipuram", "madurai", "delhi"};
		  
		  Set<String> set1=new HashSet<String>();
		  for (String string : ar) {
			set1.add(string);
		}
			
		 System.out.println(set1);
		 
	}
}
