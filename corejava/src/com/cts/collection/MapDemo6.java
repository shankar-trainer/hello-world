package com.cts.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo6 {

	public static void main(String[] args) {
		Map<Integer, String> productMap = new HashMap<Integer, String>();

		productMap.put(10001, "java book");
		productMap.put(109, "smart phone");
		productMap.put(1009, "smart Tv");

		productMap.put(10010, "smart board");
		productMap.put(10011, "smart Tv");

		productMap.put(10001, "java book");

		Set<Integer> keyset = productMap.keySet();
		for (Integer k : keyset)
			System.out.println(k + "   " + productMap.get(k));

		System.out.println("====================================");

		Collection<String> values = productMap.values();

		System.out.println(values);

		System.out.println("---------------------------------");

		Set<Entry<Integer, String>> entrySet = productMap.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

	}
}
