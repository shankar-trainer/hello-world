package com.abc.collection.main;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {

		Map<Integer, String> insuranceMap = insuranceMap = new TreeMap();

		insuranceMap.put(20145, "IFFCO Tokio Two Wheeler Insurance");
		insuranceMap.put(20165, "New India Assurance Two Wheeler Insurance");
		

		String search = "Two Wheeler";
	 
		ArrayList<Integer> list1=new ArrayList<>();
		
		for(int key:insuranceMap.keySet())
		{
		   String name=insuranceMap.get(key);
		   if(name.contains(search))
			   list1.add(key);
		}
		
		System.out.println(list1);
	

	}
}
