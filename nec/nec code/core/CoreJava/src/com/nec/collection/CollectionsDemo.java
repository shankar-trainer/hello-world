package com.nec.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("mumbai");
		cityList.add("chennai");
		cityList.add("delhi");
		cityList.add("sarjah");
		cityList.add("goa");

		System.out.println("unsorted list " + cityList);

		Collections.sort(cityList);

		System.out.println("sorted list " + cityList);
		
		if(Collections.binarySearch(cityList, "goa1")>=0)
			System.out.println("found at "+Collections.binarySearch(cityList, "goa1"));
		else
			System.out.println("not found");

		System.out.println("last element "+Collections.max(cityList));
		System.out.println("first element "+Collections.min(cityList));

         Collections.shuffle(cityList);		
         
         System.out.println("after shuffling "+cityList);
         
         
		
		
		
	}
}