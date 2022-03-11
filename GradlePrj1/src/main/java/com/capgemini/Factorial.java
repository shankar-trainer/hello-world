package com.capgemini;

public class Factorial {

	public int getFactorial(int n) {
		int f=1;
		for(int x=1;x<=n;x++)
			f=f*x;
		return f;
	}
	
}
