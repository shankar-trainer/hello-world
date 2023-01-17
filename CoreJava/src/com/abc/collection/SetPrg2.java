package com.abc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SetPrg2 {

	public static void main(String[] args) {
		List<String> citySet=new ArrayList<>(); //  ordered ,  duplicate ,  index
		citySet.add("mumbai");
		citySet.add("pune");
		citySet.add("nagpur");
		citySet.add("sholapur");
		citySet.add("pune");
		citySet.add("banglore");
		
		System.out.println(citySet);
		
		//Iterator<String> iterator = citySet.iterator();
		 ListIterator<String> listIterator = citySet.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		
		System.out.println("in reverse ==========");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		
	}
}
