package edu.coforge.collection;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPrg1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new Hashtable<>();
		
		// keys are unique
		// put add key and value
		// get(key) -- retrieve value
		
		map.put(10001, "ram kumar");
		map.put(10002, "shyam kumar");
		map.put(10003, "ram kumar");
		map.put(10004, "suman kumar");
		map.put(10001, "lal babu kumar");
		
		System.out.println(map);
		System.out.println(map.get(10002));
		System.out.println(map.get(10004));
		
		map.remove(10001);
		
		Collection<String> values = map.values(); // values()-- all values
		System.out.println(" all values "+values);
		
		Set<Integer> keySet = map.keySet();// keySet() -- all keys
		System.out.println("all keys "+keySet);
		
		System.out.println("kes ----- values");
		for(Integer key:keySet)
			System.out.println(key+"  "+map.get(key));
		
		System.out.println("using entryset ");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		// Entry -- key+value
		
		for(Entry<Integer, String> entry:entrySet)
			System.out.println(entry.getKey()+"  "+entry.getValue());
		
	}
}
