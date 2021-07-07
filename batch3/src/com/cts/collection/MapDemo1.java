package com.cts.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1{

	public static void main(String[] args) {
		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(1001, "ram parvesh");
		empMap.put(1008, "suresh kumar");
		empMap.put(1001, "umesh kumar");
		empMap.put(1003, "sri mohan kumar");
		
		
		Set<Entry<Integer, String>> entrySet = empMap.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		


	}
}