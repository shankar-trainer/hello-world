package com.audintel.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
	   
		Map<Integer, String> studentMap=new HashMap<>();
		
		studentMap.put(10001, "ram kumar");//keys are  unique values can be duplicate
		studentMap.put(10005, "ram kumar");
		studentMap.put(10002, "shyam kumar");
		studentMap.put(10003, "ram kumar");
		studentMap.put(10001, "suresh kumar");
		studentMap.put(10004, "diwakar kumar");//put to add key and value
		
		System.out.println(studentMap);//get -- using key return value
		
		System.out.println(studentMap.get(10005));
		
		String remove = studentMap.remove(10001);// remove the entry and return the value 
		System.out.println(remove +" is now removed ");
		
		for(Integer key:studentMap.keySet())            //keySet  returns all keys in the set form
			System.out.println(key+"   "+studentMap.get(key));
		
		Set<Integer> keySet = studentMap.keySet();
	    Collection<String> values = studentMap.values();
	    
	    System.out.println(keySet+"   "+values);
	   
	    Set<Entry<Integer, String>> entrySet = studentMap.entrySet();
	     
	    System.out.println("using entry set ");
	    
          for(Entry<Integer, String> entry:  entrySet)
        	  System.out.println(entry.getKey()+"  "+entry.getValue());
	    
	}
}
