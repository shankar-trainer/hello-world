package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrg2 {

	public static void main(String[] args) {
		List<String> citylist=new ArrayList<>();
		
		citylist.add("delhi");
		//citylist.add(323434);// only string is allowed
		citylist.add("chennai");
		citylist.add("delhi");
		citylist.add("kolkotta");
		citylist.add("madurai");
		citylist.add("rameswaram");
		citylist.add("banglore");
		
		System.out.println(citylist);
		System.out.println("using for  loop");
		
		for (int i = 0; i <citylist.size(); i++) {
		   System.out.print(citylist.get(i)+",    ");	
		}
		
		System.out.println(citylist.contains("delhi"));
		citylist.remove(1);
		citylist.remove("madurai");
		
		System.out.println("\n\nusing for each loop");
		// for each is added in java 5 
		for (String string : citylist) {
			System.out.println(string);
		}
		
		
		Iterable<String> it;
		
		Iterator<String> it1=citylist.iterator();
		
		System.out.println("\n\n\tusing iterator ");
		while(it1.hasNext()) {
			String s1=it1.next();
			if(s1.equals("delhi"))
				it1.remove();
			else
			System.out.println(s1);
		   //it1.remove();
		}
		
		System.out.println("after iterator ");
		System.out.println(citylist);
		//
	}
}
