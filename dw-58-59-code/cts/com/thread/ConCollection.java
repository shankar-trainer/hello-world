package cts.com.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCollection {

	public static void main(String[] args) {
	//	ArrayList<String> list1=new ArrayList<String>();
		CopyOnWriteArrayList<String> list1=new CopyOnWriteArrayList();
		
		list1.add("hello");
		list1.add("greeting");
		list1.add("good morning");
		
		Iterator<String> iterator = list1.iterator();
		
		while ( iterator.hasNext()) {
			
			System.out.println( iterator.next());
			list1.add("good after noon");//java.util.ConcurrentModificationException
		}
		
		//HashMap<String, String> map1=new HashMap<String, String>();
		ConcurrentHashMap<String, String> map1=new ConcurrentHashMap<String, String>();
		
		map1.put("a", "aaa");
		map1.put("b", "bbb");
		map1.put("c", "ccc");
		map1.put("d", "ddd");
		
		for(String key:map1.keySet()) {
			System.out.println("key "+key+" value "+map1.get(key));
		    map1.remove(key);
		}
		System.out.println(map1);
	}
}
