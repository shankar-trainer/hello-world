package com.audintel.collection;

import java.util.LinkedList;
import java.util.List;

public class LisnkedListExample {

	 public static void main(String[] args) {
		
		 //List<String> cityList=new LinkedList<>();
		 LinkedList<String> cityList=new LinkedList<>();
		 
		 cityList.add("delhi");
		 cityList.add("chennai");
		 cityList.add("vijaywada");
		 cityList.addFirst("vijaywada");
		 
		 for(Object o:cityList.toArray())
			 System.out.println(o);
		 
		 
		 System.out.println(cityList);
		 //cityList.remove();
		 cityList.removeLast();
		 
		 System.out.println(cityList);
		 
		 
	}
}
