package com.montran.java8;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		Consumer<String> consumer=a->System.out.println(a);
		consumer.accept("harendra kumar");

		Consumer<String> consumer1=System.out::println;
		consumer1.accept("surendra kumar");
	}
}
