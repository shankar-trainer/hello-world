package com.cts.model;

import java.util.Iterator;

public class PrimeNo {

	public boolean Prime(int x) {

		if (x == 1)
			return true;
		int p;
		for (p = 2; p < x; p++) {
			if (x % p == 0)
				return false;
		}
		if (p == x)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 33, 4, 7, 88, 87, 81 };

		PrimeNo pn = new PrimeNo();

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " Result Prime " + pn.Prime(ar[i]));
		}

	}
}
