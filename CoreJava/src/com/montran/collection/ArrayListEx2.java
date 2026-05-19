package com.montran.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
	//	List<String> list1=new ArrayList<String>();
		//List<String> list1=new ArrayList<>();
		ArrayList<String> list1=new ArrayList<>();
		                                // type safe program 
		                                // allows duplicated
		                                // ordered
		list1.add("delhi");
		list1.add("chennai");
		list1.add("mumbai");
		list1.add("delhi");
		list1.add("indore");
		list1.add("coimbtore");
		//list1.add(878787);
		
		
		System.out.println(list1);
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+"  ");
		}
		list1.remove(3);
		list1.remove("coimbtore");
		
		System.out.println();
		System.out.println(list1.contains("delhi"));
		System.out.println(list1.contains("kolkotta"));
		System.out.println(list1.indexOf("mumbai"));
		
		System.out.println("using for each");
		for (String string : list1) {
			System.out.print(string+" ---- ");
		}
	}
}
