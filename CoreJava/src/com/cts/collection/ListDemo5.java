package com.cts.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo5 {

	public static void main(String[] args) {
List<String> cityList=new ArrayList<>();
		
		cityList.add("chennai");
		cityList.add("chennai");
		cityList.add("madurai");
		cityList.add("ooty");
		cityList.add("nellore");
		cityList.add("delhi");
	
		Iterator<String> iterator = cityList.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		//System.out.println("last element "+iterator.next());
		
	    ListIterator<String> listIterator = cityList.listIterator();
	
	    System.out.println("list iterator................. first to last");
	    
	    while(listIterator.hasNext())
	    	System.out.println(listIterator.next());
	   
	 System.out.println();
	 System.out.println("list iterator................. last to first ");
	 while(listIterator.hasPrevious())   
	    System.out.println(listIterator.previous());
	}
}
