package com.abc.collection;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, String> map=new Hashtable<>(); // hashtable is synchronized not fast, donot accept null as key and value  
	     map.put("a", "apple"); // Map<Key, value> -- key unique(no duplicate), Value- duplicate 
	     map.put("b", "boy");       //Key - any Object  Value can be any Object
	     map.put("c", "cat");
	     map.put("b", "bubble");// this key b will overwrite previous value
	     map.put("a", "alphabet");
	     map.put("b1", "boy");  //put method to add
	     
	     System.out.println(map);
	     // get(key) to get value 
	     
	     System.out.println("a--->"+map.get("a"));
	     System.out.println("b--->"+map.get("b"));
	     
	     map.remove("a");
	     
	    		 System.out.println(map);
	 //any string literal is object 
	    		 
	    		 
	}
}
