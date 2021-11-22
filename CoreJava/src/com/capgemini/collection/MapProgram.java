package com.capgemini.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> emp_map=new HashMap<>();
		emp_map.put(677, "arvind kumar");
		emp_map.put(679, "tarak kumar");
		emp_map.put(671, "sambhu kumar");
		emp_map.put(672, "amit kumar");
		emp_map.put(675, "devendra kumar");
		System.out.println(emp_map);
		
		
		System.out.println(emp_map.get(679));
		System.out.println(emp_map.get(672));
		
		Set<Integer> keySet = emp_map.keySet();
		System.out.println("for each \n");
		for (Integer integer : keySet) {
			System.out.println(integer+"  "+emp_map.get(integer));	
		}
	
	}
}
