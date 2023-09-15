package com.coforge.model;

import org.springframework.stereotype.Component;

public class Calculator {
  public int addition(int a, int b) {
	  System.out.printf("sum of %d and %d is %d ",a,b,a+b);
	  return a+b;
  }
  public int subtraction(int a, int b) {
	  System.out.printf("\nsubtraction  of %d and %d is %d ",a,b,a-b);
	  return a-b;
  }
}
