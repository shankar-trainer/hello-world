package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		
//		List<String> language =new ArrayList<String>();
		List<String> language =new ArrayList<>();
		
		language.add("php");
		//language.add(123);
		
		language.add("python");
		language.add("ruby");
		language.add("R");
		language.add("java");
		language.add("R");
		language.add("javascript");
		language.add("react");
		
		for (String string : language) {
			System.out.print(string+" , ");
		}
		System.out.println();
		
		language.remove("react");
		language.remove(0);
		
		System.out.println(language.contains("react"));
		
		language.clear();// remove all
		System.out.println(language);
		
	}
}
