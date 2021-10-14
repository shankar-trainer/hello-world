package com.abc.collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> studentList = new LinkedHashMap<>();// ordered
		// TreeMap<>();// keys are sorted
		// HashMap<>(); // not ordered

		studentList.put(1003, "priti sharma");
		studentList.put(10001, "ashis kumar");
		studentList.put(10004, "jayant kumar");
		studentList.put(10002, "amrita gill");
		studentList.put(1002, "sarita gill");

		System.out.println(studentList);
		System.out.println(studentList.containsKey(1001));
		System.out.println(studentList.containsKey(1002));
		System.out.println(studentList.containsValue("amrita gill"));
		System.out.println(studentList.containsValue("amrita kaur"));

		Collection<String> values = studentList.values();
		Set<Integer> keySet = studentList.keySet();

		System.out.println(values);
		System.out.println(keySet);
		
		for (Integer integer : keySet) {
			System.out.println(integer+"   "+studentList.get(integer));
		}
		
		Set<Entry<Integer, String>> entrySet = studentList.entrySet();

		System.out.println(entrySet);
		System.out.println(studentList);

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}
}
