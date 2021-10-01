package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionEx1 {

	  public static void main(String[] args) {
		
		  List<Integer> list2=new ArrayList<>();
		  ArrayList<Integer> list3=new ArrayList<>();
		  
		  Collection<Integer> list1=new ArrayList<>();
		  Collection<Integer> set1=new HashSet<>();
		  
		  list1.add(1111);
		  list1.add(1112);
		  list1.add(1113);
		  System.out.println(list1);
	}
}
