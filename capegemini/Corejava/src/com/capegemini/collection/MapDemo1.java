package com.capegemini.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = 
				new  
		 HashMap<Integer, String>(); // unordered
		map1.put(1002, "python");
		map1.put(1006, "angular");
		map1.put(1001, "php");
		map1.put(1009, "html");
		map1.put(1002, "perl");

		/*Set<Integer> keys = map1.keySet();
		for (Integer i : keys) {
			System.out.println(i + " ----> " + map1.get(i));
		}*/
		
		System.out.println("Entry set");
		
         Set<Entry<Integer,String>>  set2=	map1.entrySet();
		
         for (Entry<Integer, String> entry : set2) {
	System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}

}
