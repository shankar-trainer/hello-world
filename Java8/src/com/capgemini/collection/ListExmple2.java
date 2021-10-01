package com.capgemini.collection;

import java.util.ArrayList;

public class ListExmple2 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();

		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(6);
		list1.add(7);
		list1.add(9);
		
		
		list2.add(1);
		list2.add(2);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		
		
		System.out.println("list1\n"+list1);
		System.out.println("list2\n"+list2);
		//list2.retainAll(list1);//retain only elements present in both collection
		//System.out.println(list2);
				
		list2.addAll(list1);
		System.out.println("after add of list1 list2 is ...."+list2);
		list2.removeAll(list1);
		System.out.println(list2);
		
		
		
		
		
	}
}
