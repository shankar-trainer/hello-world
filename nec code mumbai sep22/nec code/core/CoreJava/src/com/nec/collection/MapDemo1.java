package com.nec.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	
	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap=new  TreeMap<>();// sorted keys
				//HashMap<>();
		
		employeeMap.put(1001, "kamal kumar");  // no duplicate key  , allow duplicate value 
		employeeMap.put(1010, "kamal kumar");  // no duplicate key  , allow duplicate value 
		employeeMap.put(8001, "vimal kumar");
		employeeMap.put(1003, "shyam kumar");
		employeeMap.put(1002, "lalan kumar");
		employeeMap.put(1009, "kamal kumar");
		employeeMap.put(901, "abhishek kumar");
		employeeMap.put(1001, "ritik kumar");
		
		
		System.out.println("id 1001 is "+employeeMap.get(1001));
		
		System.out.println(employeeMap.containsValue("ritik kumar"));
		System.out.println(employeeMap.containsKey(901));
		
		  Set<Integer> keySet = employeeMap.keySet();
		
		  System.out.println("\nall employee");
		  System.out.println("\nid\t----name\n");
		  for (Integer integer : keySet) {
			 System.out.println(integer+"  ---  "+employeeMap.get(integer)); 
		}
		
		
		
		System.out.println(employeeMap);
		
	}
	
}
