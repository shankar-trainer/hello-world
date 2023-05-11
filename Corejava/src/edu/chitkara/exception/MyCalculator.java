package edu.chitkara.exception;

public class MyCalculator {
	static long power(int a , int b) {
	      long pow=1;
	      for (int i = 1; i <=b; i++) {
			 pow=pow*a;
		}
	      return pow;
	}
	
  public static void main(String args[]) {
	System.out.println(power(2,0));  
	System.out.println(power(1,0));  
	System.out.println(power(0,1));  
	System.out.println(power(2,3));  
  }	
}
