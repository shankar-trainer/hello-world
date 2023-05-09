package com.nec.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class mapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap=new  TreeMap<>();// sorted keys
		
		employeeMap.put(1001, "kamal kumar");  // no duplicate key  , allow duplicate value 
		employeeMap.put(1010, "kamal kumar");  // no duplicate key  , allow duplicate value 
		employeeMap.put(8001, "vimal kumar");
		employeeMap.put(1003, "shyam kumar");
		employeeMap.put(1002, "lalan kumar");
		employeeMap.put(1009, "kamal kumar");
		employeeMap.put(901, "abhishek kumar");
		employeeMap.put(1001, "ritik kumar");
		
		
		//Collection<String> values = employeeMap.values();
		// Set<Integer> keySet = employeeMap.keySet();
		
		
		Set<Entry<Integer, String>> entrySet = employeeMap.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
		  System.out.println(entry.getKey()+"\t"+entry.getValue());	
		}
	}
}
