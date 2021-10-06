package com.capegemini.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemo2 {

	public static void main(String[] args) {

		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();

		map1.put(1001, "a kumar");
		map1.put(1008, "mohan kumar");
		map1.put(2001, "surendra kumar");
		map1.put(501, "kamal kumar");
		map1.put(100, "ajit kumar");
		map1.put(321, "sheetal kumar");

		NavigableMap<Integer, String> map2 = map1.descendingMap();

		for (Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		Set<Integer> descKey = map2.descendingKeySet();
		System.out.println(descKey);

		Entry<Integer, String> entry1 = map2.ceilingEntry(121);

		System.out.println(entry1);

		Integer p2 = map2.ceilingKey(145);
		System.out.println(p2);

		int k = map1.firstKey();

		Map<Integer, String> map4 = map2.headMap(501);
		System.out.println(map4);

		System.out.println(map2.higherKey(501));

	}

}
