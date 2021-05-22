package com.cts.practice;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserMainCode {

	public static double calculateAverage(HashMap<Integer, Double> hashMap, int size) {

		double sum = 0;

		Set<Integer> keyset = hashMap.keySet();

		for (Integer i : keyset) {
			sum = sum + hashMap.get(i);
		}

		return sum / size;
	}

}

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		HashMap<Integer, Double> hashMap1 = new HashMap<Integer, Double>();

		for (int i = 0; i < n; i++) {
			hashMap1.put(scanner.nextInt(), scanner.nextDouble());
		}

		double res = UserMainCode.calculateAverage(hashMap1, n);
		
		System.out.println(new DecimalFormat("#.00").format(Math.round(res)));
		scanner.close();

	}

}
