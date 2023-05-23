package edu.chitkara.collection;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ABCD");
		list.add(1);
		list.add(new Thread());
		for (Object obj : list)
			System.out.println(obj);
	}
}
/*
 * warning -- and
 * 
 * ABCD 1 Thread[Thread-0,5,main]
 * 
 */