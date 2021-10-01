package com.capgemini.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> empMap=new HashMap<>();
		empMap.put(10001, "ashis kumar");
		empMap.put(10009, "vimal kumar");
		empMap.put(10002, "kamal kumar");
		empMap.put(10007, "amrita kumari");
		empMap.put(10008, "preetam kumar");
		
		Set<Entry<Integer, String>> entrySet = empMap.entrySet();
		
		 for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		
	}
}
