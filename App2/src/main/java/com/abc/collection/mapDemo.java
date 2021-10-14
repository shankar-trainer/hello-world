package com.abc.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Employee1{
	
}
public class mapDemo {

	public static void main(String[] args) {
		
		List<String> productList=new ArrayList<>();
		
		productList.add("pizza");
		productList.add("burger");
		productList.add("momos");
		productList.add("dosa");
		productList.add("burger");
		productList.add(1, "chilly potato");
		
		System.out.println(productList);
		System.out.println(productList.get(2));
		System.out.println(productList.get(1));
		System.out.println(productList.get(0));
		
		
		Map<Integer, String> studentList=new HashMap<>();
		Map<String, String> emptList=new HashMap<>();
		Map<Integer, Employee1> emptList1=new HashMap<>();
		
		studentList.put(10001,"ashis kumar");
		studentList.put(10002,"amrita gill");
		studentList.put(10002,"sarita gill");
		studentList.put(10003,"priti sharma");
		studentList.put(10004,"jayant kumar");
		studentList.put(null,"jayant kumar");
		studentList.put(null,"ranjan kumar");
		studentList.put(10008,null);
		studentList.put(10009,null);
		studentList.put(null,null);
		studentList.put(null,null);
		studentList.put(null,null);
	
		System.out.println(studentList.get(10001));
		System.out.println(studentList.get(10004));
		System.out.println(studentList);
		
		
	}
}
