package cts.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
Map<String, String> state_capital_map=new HashMap<>();
		
		state_capital_map.put("tamil nadu", "chennai");
		state_capital_map.put("karnataka", "banglore");
		state_capital_map.put("andhra pardesh", "hyderabad");
		state_capital_map.put("kerala", "tiruanantpuram");
		state_capital_map.put("andhra pardesh", "amrawati");
		state_capital_map.put("bihar", "patna");
		
		Set<Entry<String, String>> entrySet = state_capital_map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		Collection<String> values = state_capital_map.values();
		
		System.out.println(values);
		
		
	}
}
