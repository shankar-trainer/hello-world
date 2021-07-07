package org.cognizant.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String>  empMap=new 
				  Hashtable<Integer, String>();
				//TreeMap<Integer, String>();// its sorted by keys
				//LinkedHashMap<Integer, String>();// its ordered
				//HashMap<Integer, String>();// its not ordered
		
		empMap.put(10001, "s kumar");
		empMap.put(10002, "robert");
		empMap.put(10003, "Ronaldo");
		empMap.put(10004, "Briteny spears");
		empMap.put(10004, "s kumar");
		empMap.put(null, "michael");
		empMap.put(null, "michael");
		empMap.put(null, null);
		empMap.put(1, null);
		
		System.out.println(empMap);
		System.out.println();
		System.out.println(empMap.get(10002));
		System.out.println(empMap.get(10004));
		System.out.println(empMap.get(10003));
		
		Set<Integer> keySet = empMap.keySet();
		System.out.println("using keyset \n");
		for (Integer integer : keySet) {
			System.out.println(integer+"    "+empMap.get(integer));
		}
		
		empMap.remove(10004);
		System.out.println(empMap.containsKey(10001));
		System.out.println(empMap.containsKey(10004));
		
		Set<Entry<Integer, String>> entrySet = empMap.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}
}
