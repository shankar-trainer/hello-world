package org.cts.bean;

public class Factorial implements IFactorial {

	@Override
	public int fact(int a) {
		int k = 1;
		for (int i = 1; i <= a; i++) {
			k = k * i;
		}
		return k;
	}
}
