package com.abc.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap=new TreeMap<>();// sorted keys
	
		employeeMap.put(9887885, "gyanendra swami");
		employeeMap.put(6887886, "chanchal  swami");
		employeeMap.put(7887881, "babul suprio");
		employeeMap.put(7887887, "arvind swami");
		employeeMap.put(8887884, "deepak kumar");
		employeeMap.put(3887882, "parmod sharma");
		
		System.out.println(employeeMap);
		
		System.out.println("Employeem id 787878  is present "+employeeMap.containsKey(787878));
		System.out.println("Employeem id 3887882  is present "+employeeMap.containsKey(3887882));

		System.out.println("Employeem name arvind swami  is present "+employeeMap.containsValue
				("arvind swami"));
		for(Integer k:employeeMap.keySet())
			System.out.println(k+" =====> "+employeeMap.get(k));
		 
		// Entry<K, V>  interface for single entry in map
		
		 Set<Entry<Integer, String>> entrySet = employeeMap.entrySet();
		
		 System.out.println("\nusing entrySet method \n");
		 
		  for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}

		   Collection<String> values = employeeMap.values();
		   Set<Integer> keySet = employeeMap.keySet();		  
		   
	}
}
