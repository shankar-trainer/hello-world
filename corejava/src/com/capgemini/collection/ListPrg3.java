package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListPrg3 {

	public static void main(String[] args) {
		ArrayList<String> paperList=new ArrayList<>();
		paperList.add("hindustan");
		paperList.add("time of india");
		paperList.add("the hindi");
		paperList.add("bhaskar");
		paperList.add("jagran");
		
		System.out.println(paperList);
		Collections.sort(paperList);
		
		System.out.println(paperList);
		
		
	}
}
