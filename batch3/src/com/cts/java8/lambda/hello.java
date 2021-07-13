package com.cts.java8.lambda;

interface hello10 {
	void disp();
}

interface Calculation1 {
	int addition(int a, int b);
}

class outer10 {
	public static void main(String[] args) {

		hello10 hello1 = () -> {
			System.out.println("disp method ");
		};
		Calculation1 calculation = (x, y) -> {
			return x + y;
		};
		hello1.disp();
		System.out.println(calculation.addition(11, 22));
	}
}
