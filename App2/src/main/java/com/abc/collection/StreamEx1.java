package com.abc.collection;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(1,2,3,4,5);
		Stream<Integer> of1 = Stream.of(1,2,3,4,5);
		
		int ar[]= {11,22,33,44,55,66,77,88};
		
		IntStream stream = Arrays.stream(ar);
		
		// Intermediate stream  lazy and will  not terminate 
		
		of.forEach((a)->System.out.print(a+", "));
		
		System.out.println("\neven no only ");
		
		of1.filter((a)->a%2==0).forEach((a)->System.out.print(a+", "));
		
		System.out.println();
		stream.filter(p->p%3==0).forEach(p->System.out.print(p+" ,"));
		
		
		Stream.of(11,2,30,4,50).sorted().filter(a->a>=10).forEach(p->System.out.print(p+","));
		System.out.println();
		Stream.of(11,2,30,4,50).filter(a->a>20).limit(3).forEach(p->System.out.print(p+","));
		
		
	}
}
