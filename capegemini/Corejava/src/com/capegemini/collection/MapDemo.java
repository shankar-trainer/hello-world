package com.capegemini.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map1 = 
				new LinkedHashMap<Integer, String>();
		//TreeMap<Integer, String>();// keys are sorted
//Hashtable<Integer, String>();// null not allowed as keys or value
		//HashMap<Integer, String>(); // unordered
		map1.put(1002, "python");
		map1.put(1006, "angular");
		map1.put(1001, "php");
		map1.put(1009, "html");
		//map1.put(null, "php");
		map1.put(5678, null);
		map1.put(1002, "perl");

		System.out.println(map1);
		Set<Integer> keys = map1.keySet();
		for (Integer i : keys) {
			System.out.println(i + " ----> " + map1.get(i));
		}

		System.out.println("---------------------------");
		System.out.println("1001 ---- " + map1.get(1001));
		System.out.println("1009 ---- " + map1.get(1009));

	}

}
