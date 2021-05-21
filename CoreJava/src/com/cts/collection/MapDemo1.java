package com.cts.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new Hashtable<Integer, String>();// non null key and values are allowed
				
				//LinkedHashMap<Integer, String>();// ordered
				
				//TreeMap<Integer, String>(); //-- sorted by keys 
				//HashMap<Integer, String>();

		map1.put(10001, "math");
		map1.put(10001, "tamil");
		map1.put(10004, "computer");
		map1.put(10002, "science");
		map1.put(10005, "computer");
		map1.put(10003, "math");
		map1.put(null, "math");
		map1.put(78878, null);
		

		System.out.println(map1);
		System.out.println(map1.get(10001));
		System.out.println(map1.get(10003));

		Set<Integer> keyset = map1.keySet();

		map1.remove(10001);

		System.out.println(map1.containsKey(10002));
		System.out.println(map1.containsValue("tamil"));

		for (Integer key : keyset) {
			System.out.println(key + "    " + map1.get(key));
		}

		Collection<String> val = map1.values();

		System.out.println(val);
		for (String string : val) {
			System.out.println(string);
		}

		System.out.println("----------------------------------  entry set ---------------------");
	
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
	}
}
