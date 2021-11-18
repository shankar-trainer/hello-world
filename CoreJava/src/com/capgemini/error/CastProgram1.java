package com.capgemini.error;

public class CastProgram1 {

	public static void main(String[] args) {

		// primitive data type cast 
		int a = 98989;

		// widening
		float b1 = a;// implicit casting small data type can be casted to higher data type

		float f1 = 6756767878787.5676776f;
		// narrowing
		int k = (int) f1; // explicit casting, if higher range is assigned to lower range u have to cast

		System.out.println(k);

	}

}
