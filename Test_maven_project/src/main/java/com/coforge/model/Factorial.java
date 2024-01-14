package com.coforge.model;

public class Factorial {

	static int getFactorial(int p) {
		int f=1;
		for (int i = 1; i <=p; i++) {
			f=f*i;
		}
		return f;
	}
	static boolean checkOdd(int p) {
		if(p%2!=0)
			return true;
		return false;
	}
	
}
