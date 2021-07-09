package cts.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {
		Map<String, String> state_capital_map = new //TreeMap<String, String>();
		// all keys are sorted
		// LinkedHashMap<String, String>(); // -->ordered
		HashMap<>(); // not ordered

		state_capital_map.put("tamil nadu", "chennai");
		state_capital_map.put("karnataka", "banglore");
		state_capital_map.put("andhra pardesh", "hyderabad");
		state_capital_map.put("kerala", "tiruanantpuram");
		state_capital_map.put("andhra pardesh", "amrawati");
		state_capital_map.put("bihar", "patna");
		state_capital_map.put(null, "patna");
		state_capital_map.put("abc", null);
		

		System.out.println(state_capital_map);
		Set<String> keySet = state_capital_map.keySet();

		System.out.println("tamil nadu   " + state_capital_map.get("tamil nadu"));
		System.out.println("tamil nadu  key is present " + state_capital_map.containsKey("tamil nadu"));
		System.out.println("chennai value is present " + state_capital_map.containsValue("chennai"));

		System.out.println("using keySet");
		state_capital_map.remove("karnataka");
		for (String string : keySet) {
			System.out.println(string + " --------------> " + state_capital_map.get(string));
		}

	}
}
