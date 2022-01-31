package edu.lpu.lambda;

import java.util.ArrayList;
import java.util.HashSet;

public class StreamExample2 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		
		list1.add("delhi");
		list1.add("mumbai");
		list1.add("chennai");
		list1.add("ahmadabad");
		list1.add("chittore");
		list1.add("arabali");
		
		list1.stream().forEach(a->System.out.print(a+", "));
		System.out.println();
		list1.forEach(a->System.out.print(a+", "));
		
		System.out.println();
		  //skip will skip first n number values 
		list1.stream().skip(3).forEach(a->System.out.print(a+", "));
		
		System.out.println("\n limit \n");
		//skip will skip first n number values 
		list1.stream().limit(3).forEach(a->System.out.print(a+", "));
		
		System.out.println();
		System.out.println("no of elements "+list1.stream().count());
		
		System.out.println("\n filter with 7 chars  \n");
		list1.stream().filter(a->a.length()>=7).forEach(a->System.out.print(a+", "));

	}
	
}
