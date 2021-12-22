package com.cognizant.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new LinkedHashMap<>();//ordered 
				//TreeMap<>();// all sorted keys
		//HashMap<>();// not ordered

		map1.put(1001, "deepak kumar");
		map1.put(1004, "deepak kumar");
		map1.put(1003, "aman kumar");
		map1.put(1005, null);
		map1.put(100, null);
		map1.put(1001, "pardip kumar");
		map1.put(1002, "surendra kumar");
		map1.put(null, "surendra kumar");

		System.out.println(map1);
		System.out.println("1002 is key of " + map1.get(1002));
		map1.remove(1003);
		System.out.println(map1);
		System.out.println(map1.containsKey(1003));
		System.out.println(map1.containsValue("deepak kumar"));

		Set<Integer> keySet = map1.keySet();

		for (Integer key : keySet)
			System.out.println(key + " ---    " + map1.get(key));

		Collection<String> values = map1.values();

		System.out.println("all empId  and names are ");
		for (Integer key : keySet)
			System.out.print(key + "\t");

		System.out.println();

		for (String s : values)
			System.out.print(s + "\t");

	}
}
