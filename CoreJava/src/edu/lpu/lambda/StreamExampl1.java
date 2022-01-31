package edu.lpu.lambda;

import java.util.stream.Stream;

public class StreamExampl1 {

	public static void main(String[] args) {
		
		//stream using array 
		Integer ar[]= {11,22,2,3,4,5,6,2,6,11,3,88};
		
		Stream.of(ar).forEach(a->System.out.print(a+","));
		System.out.println("\nremove duplicate ");
		
		Stream.of(ar).distinct().forEach(a->System.out.print(a+","));
		System.out.println("\n map \n");
		Stream.of(ar).distinct().map(a->a*a).forEach(a->System.out.print(a+","));
		
		System.out.println("\n sorted \n");
		Stream.of(ar).distinct().sorted().forEach(a->System.out.print(a+","));
		
	
	}
}
