package com.coforge.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new  TreeMap<>();// sorted keys 
		map.put(10002, "aman kumar");
		map.put(10003, "raman kumar");
		map.put(10001, "lalan kumar");
		map.put(10005, "priyanshu kumar");
		map.put(10004, "aman kumar");

		Collection<String> values = map.values();
		System.out.println(values);
		System.out.println(map.keySet());
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
}
