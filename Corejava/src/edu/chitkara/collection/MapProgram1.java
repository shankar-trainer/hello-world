package edu.chitkara.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProgram1 {

	public static void main(String[] args) {
		Map<Integer, String> studentMap = new HashMap<Integer, String>();

		studentMap.put(1001, "sambhu kumar");
		studentMap.put(1004, "sunil kumar");
		studentMap.put(1003, "pawan kumar");
		studentMap.put(1002, "anil kumar");
		studentMap.put(1001, "sunil kumar");

		System.out.println(studentMap);
		System.out.println(studentMap.get(1001));
		System.out.println(studentMap.get(1002));

		System.out.println(studentMap.containsKey(1003));

		studentMap.remove(1003);
		System.out.println(studentMap.containsKey(1003));
		System.out.println(studentMap.containsValue("sunil kumar"));

		System.out.println("only values ");
		Collection<String> values = studentMap.values();

		System.out.println("only keys ");
		Set<Integer> keySet = studentMap.keySet();
		
      System.out.println("all students name "+values);		
      System.out.println("all students roll "+keySet);
       for (Integer integer : keySet) {
	    System.out.println(integer+"  "+studentMap.get(integer));	
	}
      

	}
}
