package com.montran.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo2 {

	public static void main(String[] args) {

		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(1001, "surendra kumar");
		empMap.put(1009, "rahul kumar");
		empMap.put(1002, "devansh kumar");
		empMap.put(1008, "parmod kumar");
		empMap.put(1006, "sambhu kumar");
		empMap.put(1002, "shiv shankar kumar");
		
		Set<Integer> keySet = empMap.keySet();
		
		Collection<String> values = empMap.values();
		
		for (Integer i:keySet) {
			System.out.print(i+" ,");
		}
		System.out.println();
		for (String string : values) {
			System.out.print(string+" ,");
		}
		
		Set<Entry<Integer, String>> entrySet = empMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}
}
