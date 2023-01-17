package com.abc.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class mapDemo2 {

	public static void main(String[] args) {
		
		Map<Object, String> map=new TreeMap<>();// sorted keys 
				//HashMap<>();// not synchronized accept null as key and value 
				//Hashtable<>();
		
		map.put(1, "hello");
		map.put("hi", "hello");
		map.put('c', "hello");
		//map.put(null, "hello");
		map.put("pp", null);
		
		System.out.println(map);
		
		Set<Object> keySet = map.keySet();
		for (Object key : keySet) {
			System.out.println(key+"   "+map.get(key));
		}
	}
}
