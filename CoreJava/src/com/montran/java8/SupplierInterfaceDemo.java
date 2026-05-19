package com.montran.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class Factorial {
	static int fact = 1;
	public static int getFactorial(int p) {
		for (int i = 1; i <= p; i++) 
			fact = fact * i;
		
		return fact;
	}
}

public class SupplierInterfaceDemo {

	public static void main(String[] args) {

		Supplier<Integer> supplier = () -> Integer.max(1, 2);
		System.out.println(supplier.get());

		Integer ar[] = { 11, 2, 12, 9, 1, 3, 4 };
		List<Integer> list1 = Arrays.asList(ar);

		Supplier<Object[]> supplier1 = () -> list1.toArray();
		System.out.println(Arrays.deepToString(supplier1.get()));

		Supplier<Integer> supplier_factorial = () -> Factorial.getFactorial(4);
		System.out.println("factorial of 4 is "+supplier_factorial.get());
	}
}
