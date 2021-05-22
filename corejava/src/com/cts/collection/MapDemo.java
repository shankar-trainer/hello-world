package com.cts.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> productMap = new HashMap<Integer, String>();

		productMap.put(10001, "java book");
		productMap.put(109, "smart phone");
		productMap.put(1009, "smart Tv");

		productMap.put(10010, "smart board");
		productMap.put(10011, "smart Tv");

		productMap.put(10001, "java book");

		productMap.remove(1009);
		System.out.println(productMap.containsKey(1009));
		
		System.out.println(productMap);
		
	 	String string = productMap.get(109);
	 	
		System.out.println(string);
		
	}
}
