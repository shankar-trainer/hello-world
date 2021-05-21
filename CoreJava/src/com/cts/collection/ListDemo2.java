package com.cts.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo2 {

	public static void main(String[] args) {

//		List<String> cityList=new ArrayList<String>();
		List<String> cityList = new ArrayList<>();

//		List<String> cityList1 = new ArrayList<>();
//		ArrayList<String> cityList1 = new ArrayList<>();
		Vector<String> cityList1 = new Vector<>();

		
		cityList.add("chennai");
		// cityList.add(555555);
		cityList.add("chennai");
		cityList.add("madurai");
		cityList.add("ooty");
		cityList.add("nellore");
		cityList.add("delhi");

		cityList1.add("banglore");
		cityList1.add("manglore");
		cityList1.add("sholapur");
		cityList1.add("chennai");
		cityList1.add("delhi");

		cityList.addAll(cityList1);// add one list into another list
		System.out.println(cityList.containsAll(cityList1));

		// cityList.retainAll(cityList1);

		System.out.println(cityList1);
		System.out.println(cityList);

		cityList.removeAll(cityList1);
		System.out.println(cityList);

	}
}
