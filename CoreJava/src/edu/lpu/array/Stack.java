package edu.lpu.array;

import java.util.Random;
import java.util.Scanner;

public class Stack {

	int size;
	int ar[];
	Scanner sc;

	public Stack() {
		sc = new Scanner(System.in);
		System.out.println("Enter size ");
		size = sc.nextInt();
		ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new Random().nextInt();
		}
	}

	void push(int e) {
		size++;
		ar = new int[size];
		ar[size - 1] = e;
	}

	int pop() {
		int a = ar[size - 1];
		size--;
		ar = new int[size];

		return a;
	}

	void travesrse() {
		for (int i : ar) {
			System.out.print(i);
		}
	}

}
