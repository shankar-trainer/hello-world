package com.cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
//		List<String> cityList=new ArrayList<String>();
		List<String> cityList=new ArrayList<>();
		
		cityList.add("chennai");
		//cityList.add(555555);
		cityList.add("chennai");
		cityList.add("madurai");
		cityList.add("ooty");
		cityList.add("nellore");
		cityList.add("delhi");
		
		System.out.println(cityList); 
		
		System.out.println(cityList.contains("ooty"));
		
		cityList.remove(0);
		cityList.remove("ooty");
		
		System.out.println(cityList.contains("ooty"));
		
		for (String string : cityList) {
			System.out.println(string);
		}
	}
}
