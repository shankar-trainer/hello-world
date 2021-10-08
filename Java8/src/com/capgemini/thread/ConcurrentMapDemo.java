package com.capgemini.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo {

	public static void main(String[] args) {
		//Map<Integer,String> map1=new HashMap<>();
		Map<Integer,String> map1=new ConcurrentHashMap<>();
		
		map1.put(10001,"ajay kumar");
		map1.put(10002,"vijay kumar");
		map1.put(10003,"sanjay kumar");
		
		for(Integer key:map1.keySet())
		{
			System.out.println(map1.get(key));
			map1.put(10004,"dhananjay kumar");
					//java.util.ConcurrentModificationException
		}
	}
}
