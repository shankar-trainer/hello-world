package com.coforge.model;


public class Calculator {
  public int addition(int a, int b) {
	  System.out.printf("sum of %d and %d is %d ",a,b,a+b);
	  return a+b;
  }
  public int division(int a, int b) {
	  if(b==0)
		  throw new IllegalArgumentException("denominator cannot be zero");
	  System.out.printf("\ndivision  of %d and %d is %d ",a,b,a/b);
	  return a-b;
  }
}
