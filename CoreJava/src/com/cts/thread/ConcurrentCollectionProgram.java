package com.cts.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionProgram {

	public static void main(String[] args) {
		// List<String> city=new ArrayList<String>();
		List<String> city = new CopyOnWriteArrayList<String>();

		city.add("chhennai");
		city.add("madurai");
		city.add("shivkashi");

		Iterator<String> it = city.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			city.add("varanasi");
		}
		
		System.out.println(city);
		
//		Map<Integer, Character> map=new HashMap<Integer, Character>();
		Map<Integer, Character> map=new ConcurrentHashMap<Integer, Character>();
		
		map.put(1001,'a');
		map.put(1002,'b');
		map.put(1003,'c');
		
		for(Integer i:map.keySet())
		{
			System.out.println(i+"   "+map.keySet());
			map.put(1005,'d');
		}
		System.out.println(map);
	}
}
