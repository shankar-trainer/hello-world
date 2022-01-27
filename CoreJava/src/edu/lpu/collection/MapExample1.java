package edu.lpu.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample1 {

	public static void main(String[] args) {
	Map<Integer, String> empMap=new LinkedHashMap<>();
			//reeMap<>();//keys are sorted 
			//HashMap<>();  // not ordered
	empMap.put(10001, "aman deep ");
	empMap.put(10001, "shivanash ");
	empMap.put(10005, "shivanash ");
	empMap.put(10004, "devansh ");
	empMap.put(10002, "devansh ");
	empMap.put(10003, "rafik ");
	System.out.println(empMap);
	
	System.out.println(empMap.get(10001));
	System.out.println(empMap.get(10002));
	
	System.out.println(empMap.containsKey(1));
	System.out.println(empMap.containsKey(10001));
	System.out.println(empMap.containsValue("rafik"));
	
	empMap.remove(10001);
	
	System.out.println(empMap.get(10001));
	
	System.out.println("getting all datas ");
	
	
	Set<Integer> key = empMap.keySet();// return all keys in the set form
	
	for (Integer integer : key) {
		System.out.println(integer+" ------  "+empMap.get(integer));
	}
	
	Collection<String> values = empMap.values();  // all values 
	System.out.println(key);
	System.out.println(values);
	
	
	
	
	}
}
