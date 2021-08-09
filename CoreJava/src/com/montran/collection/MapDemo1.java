package com.montran.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> empMap=new 
				  Hashtable<Integer, String>();//synchronized , not null key and value  
				//TreeMap<Integer, String>();// sort the keys 
				 //LinkedHashMap<>();//// unsynchronized and ordered
				//HashMap<>(); // unsynchronized and unordered
		empMap.put(1001,"surendra kumar");
		empMap.put(1009,"rahul kumar");
		empMap.put(1002,"devansh kumar");
		empMap.put(1008,"parmod kumar");
		empMap.put(1006,"sambhu kumar");
		empMap.put(1002,"shiv shankar kumar");
		//empMap.put(null,"shiv shankar kumar");
		//empMap.put(null,null);
		//empMap.put(67887,null);
		
		System.out.println(empMap);
		
		System.out.println(empMap.get(1001));
		System.out.println(empMap.get(1004));
		
		Set<Integer> keySet = empMap.keySet();
		empMap.remove(1001);
		System.out.println(empMap.containsKey(1002));
		System.out.println(empMap.containsKey(1007));
		
		System.out.println("all values using keyset");
		for (Integer integer : keySet) {
			System.out.println(integer+"  "+empMap.get(integer));
		}
		
		
	}
}
