package com.coforge.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapPrg2 {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();

		employeeMap.put(10001, "hari suman");
		employeeMap.put(10004, "parbhas kumar");
		employeeMap.put(10002, "suman bharti");
		employeeMap.put(10001, "ananya sharma");
		employeeMap.put(10005, "parbhas kumar");
		
		for(Integer k:employeeMap.keySet())
			System.out.println(k+"   "+employeeMap.get(k));
		
		Set<Entry<Integer, String>> entrySet = employeeMap.entrySet();
		
		for(Entry<Integer, String> entry:entrySet)
			System.out.println(entry.getKey()+"  "+entry.getValue());
	
	}
}
