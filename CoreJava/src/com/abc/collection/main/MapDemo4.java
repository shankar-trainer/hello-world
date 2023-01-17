package com.abc.collection.main;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo4 {

	public static void main(String[] args) {

		LinkedHashMap<String, String> country_capital = new LinkedHashMap<>();
		country_capital.put("new delhi", "india");
		country_capital.put("dhaka", "bangla desh");
		country_capital.put("colombo", "srilanka");
		country_capital.put("rangoon", "burma");

		System.out.println(country_capital);

		for (Entry<String, String> entry : country_capital.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}

}
