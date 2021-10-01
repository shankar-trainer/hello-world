package com.capgemini.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExmple1 {

	public static void main(String[] args) {
		List<Float> salary_list=new ArrayList<>();
		
		ArrayList<Float> salary_list1=new ArrayList<>();
	
		salary_list1.add(87788.676f);
		salary_list1.add(17788.676f);
		salary_list1.add(67788.676f);
		salary_list1.add(47788.676f);
		salary_list1.add(97788.676f);
		salary_list1.add(37788.676f);
		salary_list1.add(10000.0f);
		salary_list1.add(11000.0f);
		
		salary_list1.remove(1);
		salary_list1.remove(37788.676f);
				
		salary_list.add(10000.0f);
		salary_list.add(11000.0f);
		salary_list.add(9000.0f);
		salary_list.add(12000.0f);
		salary_list.add(14000.0f);
		
		salary_list.addAll(salary_list1);
		   // addAll will add one list elements into another list
		
		System.out.println(salary_list);
		System.out.println(salary_list.containsAll(salary_list1));
		
		salary_list.removeAll(salary_list1);
		//salary_list.retainAll(salary_list1);
		System.out.println(salary_list);
		
	}
}
