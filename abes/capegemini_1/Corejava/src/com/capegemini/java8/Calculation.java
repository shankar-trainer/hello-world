package com.capegemini.java8;
@FunctionalInterface
interface  Addition{
	float add(float a, float b);
}

public class Calculation {

	public static void main(String[] args) {
		/*
		 * Addition addition=new Addition() {
		 * 
		 * @Override public float add(float a, float b) { return a+b; } };
		 * 
		 * System.out.println("sum is "+addition.add(3.4f,6.7f));
		 */
		Addition addition2=(x,y)->{ return x+y;};
		Addition addition3=(x,y)-> x+y;
		
		System.out.println("sum is "+addition2.add(3.4f,6.7f));
	}
}
