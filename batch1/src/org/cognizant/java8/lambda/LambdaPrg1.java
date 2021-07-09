package org.cognizant.java8.lambda;

interface Hello {
	void disp();
}
interface Calculation{
	int addition(int a, int b);
}

public class LambdaPrg1 {

	public static void main(String[] args) {
		Hello hello1 = () -> System.out.println("hello world");
      Calculation calculation=(x,y)-> {return x+y;};
		hello1.disp();
		System.out.println("sum is "+calculation.addition(11, 33));
	}
}
