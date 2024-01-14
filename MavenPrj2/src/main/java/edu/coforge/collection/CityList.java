package edu.coforge.collection;

import java.util.ArrayList;
import java.util.List;

public class CityList {
	public static void main(String[] args) {
		List<String> citylist=new ArrayList<>();
		
		citylist.add("delhi");
		//citylist.add(6767667);
		citylist.add("noida");
		citylist.add("delhi");
		citylist.add("kolkotta");
		citylist.add("chennai");
	
		System.out.println(citylist);
		System.out.println("using for loop ");
		for (int i = 0; i <citylist.size(); i++) {
			System.out.print(", "+citylist.get(i));
		}
		
		System.out.println("\nusing for loop \n");
		for (String s:citylist) {
			System.out.print(", "+s);
		}
		
		System.out.println(citylist.isEmpty());
		System.out.println("contains noida "+citylist.contains("noida"));
		
		citylist.remove("noida");
		System.out.println("contains noida "+citylist.contains("noida"));

		citylist.clear();// clear removes all values
		System.out.println();
		System.out.println(citylist);
	}
}
