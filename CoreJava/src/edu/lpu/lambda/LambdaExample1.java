package edu.lpu.lambda;

public class LambdaExample1 {

	interface Calculation{
		int addition(int a, int b);
	}
	
	public static void main(String[] args) {
		Calculation calculation1=(x,y)-> {return x+y;};
		Calculation calculation2=(x,y)-> x+y;
		
		System.out.println(calculation2.addition(11, 22));
	}
}
