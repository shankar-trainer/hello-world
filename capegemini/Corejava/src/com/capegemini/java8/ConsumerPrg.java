package com.capegemini.java8;

import java.util.function.Consumer;

public class ConsumerPrg {

	public static void main(String[] args) {
		
	Consumer<String> consumer=	a->System.out.println(" hello "+a);
		
	consumer.accept("mohan kumar");
	
	Consumer<String> consumer1=	System.out::println;
		
	consumer1.accept("mohan kumar");
	
	
	}
}
