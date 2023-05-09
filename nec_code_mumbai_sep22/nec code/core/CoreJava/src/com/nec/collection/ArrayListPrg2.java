package com.nec.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPrg2 {

	public static void main(String[] args) {
		List<String> cityList=new ArrayList<>();
		cityList.add("mumbai");
		cityList.add("new delhi");
		cityList.add("rameshwaram");
		cityList.add("lucknow");
		cityList.add("mumbai");
		                           // list supports index
		                             // list allows duplicates
		                             // generalized array
		System.out.println(cityList.contains("patna"));
		System.out.println(cityList.contains("mumbai"));
		System.out.println(cityList);
		
		System.out.println(cityList.get(0));
		System.out.println(cityList.get(1));
		System.out.println(cityList.get(2));
		
		cityList.remove(0);
		cityList.remove("lucknow");
		
		System.out.println(cityList);
	    Collections.sort(cityList);
	    
	    System.out.println("sorted "+cityList);
		
	    System.out.println("using for each ");
	    for (String string : cityList) {
		    System.out.println(string );	
		}
		
	    System.out.println("using for loop ");
	    
	    for (int i = 0; i < cityList.size(); i++) {
		  System.out.println(cityList.get(i));	
		}
		
	}
}
