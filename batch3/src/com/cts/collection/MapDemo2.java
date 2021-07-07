package com.cts.collection;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

class MapDemo2 {

	public static void main(String args[]) {

		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(1001, "ram parvesh");
		empMap.put(1008, "suresh kumar");
		empMap.put(1001, "umesh kumar");
		empMap.put(1003, "sri mohan kumar");

		System.out.println(empMap);
		System.out.println(empMap.get(1001));
		System.out.println(empMap.get(1002));

		Set<Integer> key = empMap.keySet();

		empMap.remove(1008);
		for (Integer integer : key) {
			System.out.println(integer + "    " + empMap.get(integer));
		}
		Collection<String> collection = empMap.values();
		System.out.println("values " + collection);
	}

}
