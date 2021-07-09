package cts.collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo3 {

	public static void main(String[] args) {
		TreeMap<String, String> state_capital_map = new TreeMap<String, String>();

		state_capital_map.put("tamil nadu", "chennai");
		state_capital_map.put("karnataka", "banglore");
		state_capital_map.put("andhra pardesh", "hyderabad");
		state_capital_map.put("kerala", "tiruanantpuram");
		state_capital_map.put("andhra pardesh", "amrawati");
		state_capital_map.put("bihar", "patna");

		SortedMap<String, String> sortedmap=state_capital_map;
		
		System.out.println(sortedmap.firstKey());
		System.out.println(sortedmap.lastKey());
		System.out.println("tail map from karnataka "+sortedmap.tailMap("karnataka"));
		
		NavigableSet<String> navigableKeySet = state_capital_map.navigableKeySet();

		System.out.println(navigableKeySet);// sorted key set

		System.out.println("descending set " + navigableKeySet.descendingSet());

		System.out.println("ceiling " + navigableKeySet.ceiling("kerala"));

		NavigableMap<String, String> navigableMap = state_capital_map;

		System.out.println(navigableMap.lowerEntry("bihar"));
		System.out.println(navigableMap.higherEntry("bihar"));
		System.out.println(navigableMap.higherKey("bihar"));
		System.out.println(navigableMap.lowerKey("bihar"));

		TreeSet<String> sweets = new TreeSet<String>();
		sweets.add("jalebi");
		sweets.add("rasogulla");
		sweets.add("laddu");
		sweets.add("jalebi");

		SortedSet<String> sset = sweets;

		System.out.println("sorted set first last and subset ");
		System.out.println(sset.first());
		System.out.println(sset.last());

		System.out.println(sset.subSet("laddu", "rasogulla"));
		System.out.println(sset);
	}
}
