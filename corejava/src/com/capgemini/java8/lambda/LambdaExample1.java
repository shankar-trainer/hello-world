package com.capgemini.java8.lambda;

//@FunctionalInterface
interface Calculation {
	int addition(int a, int b);

}

public class LambdaExample1 {

	Calculation calculation = new Calculation() {
		@Override
		public int addition(int a, int b) {
			return a + b;
		}
	};

	Calculation calculation1 = (x, y) -> {
		return x + y;
	};

	Calculation calculation2 = (x, y) -> x + y;

	public static void main(String[] args) {
		LambdaExample1 example1 = new LambdaExample1();
		System.out.println(example1.calculation2.addition(12, 13));
	}

}
