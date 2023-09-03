package com.coforge.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPrg1 {

	
	public static void main(String[] args) {
	Map<Integer, String>	employeeMap=new TreeMap<>();// sorted keys, no support of null 
			//Hashtable<>();
	// Hashtable  legacy class, no support of null as key and value, all methods are synchronized
			//HashMap<>();
	
	employeeMap.put(10001,"hari suman");
	employeeMap.put(10004,"parbhas kumar");
	employeeMap.put(10002,"suman bharti");
	employeeMap.put(10001,"ananya sharma");
	employeeMap.put(10005,"parbhas kumar");
	//employeeMap.put(null,"parbhas kumar");
	employeeMap.put(10006,null);
	employeeMap.put(10007,null);
	
	System.out.println(employeeMap.remove(10001));
	System.out.println(employeeMap.remove(1000100));
	//employeeMap.put(null,null);
	
	 // duplicate key not allowed
	// allows key and values to be null
	// only one key can be null 
	//multiple null values are allowed
	
	System.out.println(employeeMap);
	System.out.println(employeeMap.get(10001));
	System.out.println(employeeMap.size());
	
	Set<Integer> keySet = employeeMap.keySet();
	     for (Integer integer : keySet) {
			System.out.println(integer+"-------------"+employeeMap.get(integer));
		}
	}
}
