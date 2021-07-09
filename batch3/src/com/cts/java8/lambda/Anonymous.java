package com.cts.java8.lambda;

@FunctionalInterface
interface Hello {
	void disp();
}

@FunctionalInterface
interface Calculation {
	float addition(float a, float b);
}

public class Anonymous {

	public static void main(String[] args) {
		
		Hello h = () -> {
			System.out.println("disp method");
		};
		h.disp();
		Calculation calculation = (x, y) -> {
			return x + y;
		};
		System.out.println(calculation.addition(12.3f, 14.5f));
	}
}
