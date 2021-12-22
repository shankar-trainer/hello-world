package com.cognizant.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();

		map1.put(1001, "deepak kumar");
		map1.put(1004, "deepak kumar");
		map1.put(1003, "aman kumar");
		map1.put(1005, null);
		map1.put(100, null);
		map1.put(1001, "pardip kumar");
		map1.put(1002, "surendra kumar");
		map1.put(null, "surendra kumar");
		map1.put(null, "amit kumar");

        //System.out.println(map1);

		Set<Entry<Integer, String>> entrySet = map1.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "  ----   " + entry.getValue());
		}
		
	}
}
