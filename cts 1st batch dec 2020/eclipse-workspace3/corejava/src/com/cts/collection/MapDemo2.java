package com.cts.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<Integer, String> empMap = new  TreeMap<Integer, String>();// keys are sorted
		
		
				//LinkedHashMap<Integer, String>();// ordered 

		empMap.put(1005, "hari kumar");
		empMap.put(1002, "suresh kumar");
		empMap.put(1001, "amrendra kumar");
		empMap.put(1004, "surendra kumar");
		empMap.put(1005, "harendra kumar");
		empMap.put(1006, "virendra kumar");

		System.out.println(empMap);

		Set<Integer> key = empMap.keySet();

		System.out.println("All Records ");

		for (Integer integer : key) {
			System.out.println(integer + "    " + empMap.get(integer));
		}

		Collection<String> collection = empMap.values();

		System.out.println(empMap.containsValue("harendra kumar"));
		System.out.println(empMap.containsValue("hari kumar"));
		
		System.out.println(key);
		System.out.println(collection);
	}
}
