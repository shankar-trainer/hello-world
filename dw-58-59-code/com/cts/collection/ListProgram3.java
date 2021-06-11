package com.cts.collection;

import java.util.List;
import java.util.ArrayList;

public class ListProgram3 {

	public static void main(String[] args) {
		//List<String> city1=new ArrayList<>();
		ArrayList<String> city1=new ArrayList<>();
		
		city1.add("chennai");
		city1.add("maduirai");
		city1.add("banglore");
		city1.add("ooty");
		city1.add("hyderabad");
		
		List<String> city2=new ArrayList<>();
		city2.add("delhi");
		city2.add("noida");
		city2.add("guragaon");
		city2.add("faridabad");
		city2.add("ghaziabad");
		
		System.out.println(city1);
		System.out.println(city2);
		
		city1.addAll(city2);
		
		System.out.println(city1);
		
		city1.remove("ooty");
		
		city1.removeAll(city2);
		
		
	}
}
