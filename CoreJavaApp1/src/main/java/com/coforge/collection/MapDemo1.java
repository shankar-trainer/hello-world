package com.coforge.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new  TreeMap<>();// sorted keys 
		//HashMap<>();
		map.put(10002, "aman kumar");
		map.put(10003, "raman kumar");
		map.put(10001, "lalan kumar");
		map.put(10005, "priyanshu kumar");
		map.put(10004, "aman kumar");

		System.out.println(map);
		System.out.println(map.get(10001));
		System.out.println(map.get(10002));

		Set<Integer> keySet = map.keySet();
		map.remove(10001);
		System.out.println(map.containsKey(10002));
		System.out.println(map.containsValue("raman kumar"));

		for (Integer integer : keySet) {
			System.out.println(integer + " " + map.get(integer));
		}
	}
}
