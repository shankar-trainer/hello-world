package com.coforge.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.coforge.exception.User;

public class ListExample1 {                            

	public static void main(String[] args) {
		Collection collection=new ArrayList();
		collection.add(444543);
		collection.add(new Integer(444));
		collection.add(66676.56f);
		collection.add("delhi");

		collection.add(new User());
		System.out.println(collection.contains(444543));
		collection.remove(444543);
		System.out.println(collection.contains(444543));
		System.out.println(collection.contains("delhi"));
		System.out.println(collection);

		List  list1=new ArrayList();
		list1.add("hello");
		list1.add(1);
		list1.add(22.34f);
		list1.add(55.4);
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		
		System.out.println("using for loop");
		for (int i = 0; i < list1.size(); i++) 
			System.out.println(list1.get(i));
		
		System.out.println("using for  each loop");
		for (Object object : list1) 
			System.out.println(object);
		
	}
}
