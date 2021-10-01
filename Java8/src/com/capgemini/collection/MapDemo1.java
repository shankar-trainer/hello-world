package com.capgemini.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, String> citymap = new LinkedHashMap<>();// ordered
		// TreeMap<>();// keys are sorted
		// HashMap<>(); // not ordered

		citymap.put("d", "delhi");
		citymap.put("h", "hyderabad");
		citymap.put("b", "banglore");
		citymap.put("c", "chennai");
		citymap.put("b", "bhumneswar");

		System.out.println(citymap);
		System.out.println(citymap.get("d"));
		System.out.println(citymap.get("h"));

		Set<String> keySet = citymap.keySet();

		citymap.remove("d");

		for (String key : keySet) {
			System.out.println(key + "  ---- >" + citymap.get(key));
		}

		System.out.println(citymap.containsKey("a"));
		System.out.println(citymap.containsValue("hyderabad"));

		Collection<String> values = citymap.values();

		System.out.println("\ncity names are ");
		for (String string : values)
			System.out.println(string);

	}
}
