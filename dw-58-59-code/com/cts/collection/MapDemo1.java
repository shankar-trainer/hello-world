package com.cts.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
//		Map<Integer, String> map1=new HashMap<Integer, String>();
		Map<Integer, String> map1=new TreeMap<Integer, String>();//// no null key n value
		//Map<Integer, String> map1=new Hashtable<Integer, String>();// no null key n value
		 
		map1.put(10001, "pawan kumar");
		map1.put(1008, "ramesh kumar");
		map1.put(10, "amit kumar");
		map1.put(10001, "janardan kumar");
		map1.put(1, "sitaram  kumar");
		//map1.put(null, "sitaram  kumar");
		//map1.put(null, "suresh  kumar");
		//map1.put(null, null);
		//map1.put(8787, null);
	
		System.out.println(map1);
		System.out.println(map1.get(1));
		System.out.println(map1.get(10));
		
		map1.remove(10001);
		
		System.out.println("map "+map1.get(10001));
		
		Set<Integer> keySet = map1.keySet();
		
		System.out.println("using foreach with keyset ");
		
		for (Integer integer : keySet) {
			System.out.println(integer+"------------>"+map1.get(integer));
		}
	}
}
