package com.cts.collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> state_capital=new LinkedHashMap<String, String>();
		state_capital.put("tamil nadu","chennai");
		state_capital.put("andhra pardesh","hyderabad");
		state_capital.put("karnataka","banglore");
		state_capital.put("kerala","tiruananatpuram");

		System.out.println(state_capital);
		
		Set<Entry<String, String>> entrySet = state_capital.entrySet();
		
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"..........   "+entry.getValue());
		}
		
		System.out.println(state_capital.keySet());
		System.out.println(state_capital.values());
		
	}
}
