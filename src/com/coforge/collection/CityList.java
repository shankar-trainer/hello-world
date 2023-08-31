package com.coforge.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityList {

	public static void main(String[] args) {
//		List<String> list1=new ArrayList<>();
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("delhi");
		list1.add("noida");
		list1.add("gurgaon");
		list1.add("noida");
		list1.add("gurgaon");
		list1.add("chennai");
		System.out.println(list1);
		System.out.println(list1.size());
		
		for (String string : list1) {
			System.out.println("\t"+string);
		}
		
		System.out.println("using iterator ");
		Iterator<String> iterator = list1.iterator();
		
		while(iterator.hasNext()){
			String s=iterator.next();
			System.out.print(s+", ");
		    if(s.equals("gurgaon"))
			iterator.remove();
		}
		System.out.println();
		System.out.println(list1);
	}
}
