package com.capgemini.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BackedCollection_MapPrg1 {

	public static void main(String[] args) {
		
		
		TreeMap<String, String> state_cpaital_map=new TreeMap<>();//keys are sorted and null is not allowed as key 
				//Hashtable<>(); // not allow key and values to be null
				//HashMap<>();
		
		state_cpaital_map.put("chennai", "tamil nadu");
		state_cpaital_map.put("tiruannatpuram", "kerala");
		state_cpaital_map.put("banglore", "karnataka");
		state_cpaital_map.put("lucknow", "Uttar Pardesh");
		state_cpaital_map.put("patna", "Bihar");
		//state_cpaital_map.put(null, "abc");
		//state_cpaital_map.put(null, null);
		//state_cpaital_map.put(null, null);
		
		System.out.println(state_cpaital_map);
		
		
		Entry<String, String> ceilingEntry = state_cpaital_map.ceilingEntry("banglore");
		System.out.println(ceilingEntry);
		System.out.println(state_cpaital_map.higherKey("patna"));
		System.out.println(state_cpaital_map.descendingKeySet());
		System.out.println(state_cpaital_map.descendingMap());
		
		
	}
}
