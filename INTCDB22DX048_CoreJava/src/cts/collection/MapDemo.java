package cts.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String>  map1=new  TreeMap<>();//sorted by key
				//HashMap<>();
		
		map1.put(10009,"ram kumar");
		map1.put(10008,"shyam kumar");
		map1.put(10009,"ram kumar");
		map1.put(10003,"amit kumar");
		map1.put(10004,"neeraj kumar");
		map1.put(10002,"navin kumar");
		map1.put(10001,"saurabh kumar");
		System.out.println(map1);
		
	}
}
