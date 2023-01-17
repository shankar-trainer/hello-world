package com.abc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

class User {
	String name = "ram kumar";

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}

public class Program1 {

	public static void main(String[] args) {

		//Collection collection1 = new ArrayList();
		//List collection1 = new ArrayList();
		//ArrayList collection1 = new ArrayList();
		Vector collection1 = new Vector();

		Collection collection2 = new HashSet();

		collection1.add(21223);// auto boxing
		collection1.add(21256.55f);// auto boxing
		collection1.add(new Integer(21223));
		collection1.add(new User());
		collection1.add(21223);// auto boxing
		
		System.out.println(collection1);
		System.out.println(collection1.get(0));
		System.out.println(collection1.get(1));

	}

}
