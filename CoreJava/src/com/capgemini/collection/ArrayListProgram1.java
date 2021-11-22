package com.capgemini.collection;

import java.util.ArrayList;

public class ArrayListProgram1 {

	public static void main(String[] args) {
		ArrayList<String> languages=new ArrayList<>();
		
		languages.add("java");
		languages.add("jpython");
		languages.add("java");
		languages.add("java");
		languages.add("php");
		languages.add("perl");
		languages.add("c");
		
		
		ArrayList<String> languages1=new ArrayList<>();
		
		languages1.add("java");
		languages1.add("c++");
		languages1.add("ruby on rail");
		languages1.add("node");
		languages1.add("java");
		languages1.add("react");
		languages1.add("c");
		
		System.out.println(languages);
		System.out.println(languages1);
		
		languages.addAll(languages1);
		
		System.out.println(languages);
		System.out.println(languages.containsAll(languages1));
		
		System.out.println(languages.size());
		
		languages.removeAll(languages1);
		System.out.println(languages);
		
	}
}
