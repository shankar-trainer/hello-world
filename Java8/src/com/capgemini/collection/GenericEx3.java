package com.capgemini.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericEx3 {

	public static void main(String[] args) {
		
		List<Number> list=new ArrayList<>();
		list.add(656565);
		list.add(656565L);
		list.add(656565.00f);
		
		//Employee1 Manager Director 
		
		List<Employee1> list2=new ArrayList<>();
		list2.add(new Manager());
		list2.add(new Director());
		
		List<Integer> list3=new ArrayList<>();
		
		//list=list3;// Generic types does not follow inheritance
		
		
	}
}
