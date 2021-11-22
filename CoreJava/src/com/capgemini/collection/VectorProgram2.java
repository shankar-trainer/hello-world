package com.capgemini.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorProgram2 {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		
		vector.add("anand kumar");
		//vector.add(878787);
		vector.add("vivek kumar");
		vector.add("sumit kumar");
		vector.add("rishabh kumar");
		vector.add("vivek kumar");
		vector.add("vivek kumar");
		vector.add(2,"vivek sharma");
		
		//List-- Vector -- allows duplicate
		//List-- Vector -- support index
		System.out.println(vector.size());
		System.out.println(vector.contains("vivek kumar"));
		System.out.println(vector.contains("vivek anand"));
		
		System.out.println(vector);
		System.out.println(vector.get(0));
		System.out.println(vector.get(1));
		System.out.println(vector.get(2));
		System.out.println(vector.get(3));
	
		System.out.println("using for loop ");
		for (int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
		vector.remove(1);
		vector.remove("sumit kumar");
		System.out.println("using for  each loop ");
		for (String i :vector) {
			System.out.println(i);
		}
		
	}
}
