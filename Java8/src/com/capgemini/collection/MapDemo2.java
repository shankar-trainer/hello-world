package com.capgemini.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer, String> empMap=new 
				Hashtable<>();//synchronized  methods , keys values can not be null 
				//LinkedHashMap<Integer, String>();//ordered allows keys n value as null
				//TreeMap<>();// keys are sorted  allows keys not null  n value can be  null
				//HashMap<>();// not ordered ,allows keys n value as null
		empMap.put(10009, "vimal kumar");
		empMap.put(10001, "ashis kumar");
		empMap.put(10002, "kamal kumar");
		empMap.put(10008, "preetam kumar");
		empMap.put(10007, "amrita kumari");
		
		//empMap.put(10055, null);
		//empMap.put(null, "");
		//empMap.put(null, null);
		//empMap.put(null, null);
		
		Set<Entry<Integer, String>> entrySet = empMap.entrySet();
		
		 for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}
}
