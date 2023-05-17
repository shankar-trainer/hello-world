package edu.chitkara.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		// TreeMap sorted by keys
		Map<String, String> stateCapital = new TreeMap<>();
		stateCapital.put("punjab", "chhandigadh");
		stateCapital.put("haryana", "chhandigadh");
		stateCapital.put("UP", "lucknow");
		stateCapital.put("MP", "bhopal");
		stateCapital.put("tamil nadu", "chennai");
		stateCapital.put("telengana", "hyderabad");
		stateCapital.put("karanataka", "banglore");
		stateCapital.put("west bengal", "kolkotta");
		System.out.println(stateCapital);

		Set<String> keySet = stateCapital.keySet();
		
		Set<Entry<String, String>> entrySet = 
				stateCapital.entrySet();
		
         for (Entry<String, String> entry : entrySet) {
System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

}
