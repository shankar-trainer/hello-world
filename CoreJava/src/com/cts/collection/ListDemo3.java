package com.cts.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo3 {

	public static void main(String[] args) {

		ArrayList<String> cityList = new ArrayList<>();

		cityList.add("chennai");
		cityList.add("chennai");
		cityList.add("madurai");
		cityList.add("ooty");
		cityList.add("nellore");
		cityList.add("delhi");

		System.out.println(cityList);

		Collections.sort(cityList);

		for (String string : cityList) {
			System.out.println(string);
		}

		int pos = Collections.binarySearch(cityList, "delhi");
		System.out.println(pos);
		
		System.out.println(Collections.max(cityList));
		System.out.println(Collections.min(cityList));
		

	}
}
