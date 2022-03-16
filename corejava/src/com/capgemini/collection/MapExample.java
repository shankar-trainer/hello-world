package com.capgemini.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// no duplicate keys are allowed
		// duplicate values are allowed

		Map<Integer, String> employeeMap = new HashMap<>();
		// key value

		employeeMap.put(10001, "amrendra kumar");
		employeeMap.put(10002, "virendra kumar");
		employeeMap.put(10005, "surendra kumar");
		employeeMap.put(10006, "amrendra kumar");
		employeeMap.put(10003, "jitendra kumar");
		employeeMap.put(10004, "pushpendra kumar");
		employeeMap.put(10001, "dharmendra kumar");
		employeeMap.put(10007, "amrendra kumar");

		System.out.println(employeeMap);

		System.out.println(employeeMap.get(10007));
		employeeMap.remove(10005);

		Set<Integer> keySet = employeeMap.keySet();
		for (Integer k : keySet)
			System.out.println(k + "---------" + employeeMap.get(k));

		System.out.println(employeeMap.containsKey(10004));
		System.out.println(employeeMap.containsKey(10005));
		System.out.println(employeeMap.containsValue("amrendra kumar"));

		
		System.out.println("using entry set ");
		Set<Entry<Integer, String>> entrySet = employeeMap.entrySet();

		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "  ---  " + entry.getValue());
		}

	}
}
