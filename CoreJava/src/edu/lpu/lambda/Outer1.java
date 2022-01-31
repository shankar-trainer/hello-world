package edu.lpu.lambda;

public class Outer1 {

	static class Inner1{
		static int y=100;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Outer1.Inner1.y);
	}
}
