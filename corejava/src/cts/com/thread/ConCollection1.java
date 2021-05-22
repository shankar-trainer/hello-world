package cts.com.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConCollection1 {

	public static void main(String[] args) {

		// List<String> list1=new ArrayList<String>();

		List<String> list1 = new CopyOnWriteArrayList<String>();

		list1.add("hello");
		list1.add("greeting");
		list1.add("welcome");

		Iterator<String> it = list1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			list1.add("hello123");
		}

		System.out.println(list1);

//		HashMap<String, String> map1 = new HashMap<String, String>();
		ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<String, String>();

		map1.put("a", "aaaa");
		map1.put("b", "bbbb");
		map1.put("c", "cccc");
		map1.put("d", "dddd");
		map1.put("e", "eeee");
		map1.put("f", "ffff");

		for (String key : map1.keySet()) {
			if (key.contentEquals("d"))
				map1.remove("d");
		}
		System.out.println(map1);
	}

}
