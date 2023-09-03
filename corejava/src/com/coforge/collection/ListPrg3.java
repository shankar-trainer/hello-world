package com.coforge.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListPrg3 {

	public static void main(String[] args) {
		String state[] = { "uttar pardesh", "tamil nadu", "bihar", "punjab" };

		List<String> asList = Arrays.asList(state);
		
		Collections.sort(asList);
		System.out.println(asList);

		Collections.reverse(asList);
		System.out.println(asList);

		Map<Integer, String> employeeMap = new HashMap<>();

		employeeMap.put(10001, "hari suman");
		employeeMap.put(10004, "parbhas kumar");

		Collection<String> values = employeeMap.values();
		//Collection -- interface , Collections -- class

		Set<Integer> keySet = employeeMap.keySet();
		System.out.println(keySet);
		System.out.println(values);
		
		for (String s : values) {
			System.out.println(s);
		}
		
	}
}
