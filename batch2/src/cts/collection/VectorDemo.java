package cts.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> food_list=  new  Vector<String>();
		System.out.println(food_list.size());
		System.out.println(food_list.capacity());
		
		food_list.add("pizaza");
		food_list.add("burger");
		food_list.add("pizaza");
		food_list.add("pasta");
		food_list.add("momos");
		food_list.add("biryani");
		food_list.add("chicken tandoori");
		food_list.add("chicken afghani");
		food_list.add("pizaza");
		food_list.add("pasta");
		food_list.add("pasta");
		System.out.println(food_list);
		
		System.out.println("\n"+food_list.size());
		System.out.println(food_list.capacity());
		
	}
}
