package cts.java8.lambda;

@FunctionalInterface
interface Hello {
	void disp();
}

interface Calculation {
	float addition(float a, float b);
}

public class lambdaEx1 {

	public static void main(String[] args) {

		Hello hello = () -> {
			System.out.println("this is hello");
		};
		hello.disp();
		Calculation calculation = (a, b) -> {
			return a + b;
		};

		System.out.println(calculation.addition(11.2f, 33.4f));
	}
}
