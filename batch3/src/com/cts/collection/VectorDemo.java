package com.cts.collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
//		List<String> list_animal=new Vector<String>();
		Vector<String> list_animal=new Vector<String>();
		
		System.out.println(list_animal.capacity());
		System.out.println(list_animal.size());
		
		list_animal.add("dog");
		list_animal.add("cow");
		list_animal.add("tiger");
		list_animal.add("zebra");
		list_animal.add("elephant");
		list_animal.add("jirraffe");
		list_animal.add("mule");
		list_animal.add("elephant");
		list_animal.add("ant");
		list_animal.add("cobra");
		list_animal.add("python");
		//list_animal.remove(0);
		//list_animal.remove("elephant");
		
		System.out.println(list_animal);

		System.out.println(list_animal.capacity());
		System.out.println(list_animal.size());
		
	}
}
