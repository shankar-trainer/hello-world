package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		
		List<String> language =new ArrayList<>();
		List<String> language1 =new ArrayList<>();
		
		language.add("php");
		language.add("python");
		language.add("ruby");
		language.add("R");
		language.add("java");
		language.add("R");
		language.add("javascript");
		language.add("react");
		
		language1.add("perl");
		language1.add("ruby");
		language1.add("jython");
		language1.add("angular");
		language1.add("R");
		language1.add("bonescript");
		language1.add("java");
		language1.add("iron python");
		
		
		System.out.println(language);
		System.out.println(language1);
		
		language.addAll(language1);
		System.out.println(language.containsAll(language1));
		
		System.out.println(language);
		language.removeAll(language1);
		System.out.println(language);
	}
}
