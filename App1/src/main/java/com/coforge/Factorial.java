package com.coforge;

public class Factorial {

	public long myfactorial(int a) {
		long f=1;
		for (int i = 1; i <=a; i++) {
			f=i*f;
		}
		return f;
	}

}
