package edu.coforge.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrg2 {

	public static void main(String[] args) {
	Map<Integer, String> map=new LinkedHashMap<>(); // ordered 
			//TreeMap<>();// keys sorted  
			//HashMap<>();//new class not synchronized support of null key and value
			//Hashtable<>();  //legacy synchronized no support of null key and value
		
	map.put(10004, "suman kumar");
		map.put(10001, "ram kumar");
		map.put(10003, "ram kumar");
		map.put(10002, "shyam kumar");
		map.put(10001, "lal babu kumar");
//		map.put(null, "lal babu kumar");
		map.put(567567, null);
		
		System.out.println(map);
	}
}
