package com.cts.inner;

interface bank {
	void withdraw();
}
interface Addition{
int sum(int a, int b);
}

public class AnonyMousDEmo1 {

	bank bank = new bank() {// anonymous inner class

		@Override
		public void withdraw() {
			System.out.println("withdraw amount");
		}
	};
	public static void main(String[] args) {
	}
}

class Myclass12 {

	bank b1 = () -> {// lambda expression
		System.out.println("withdraw inside  myclass 12");
	};

	public static void main(String[] args) {
		Myclass12 myclass12 = new Myclass12();
		myclass12.b1.withdraw();
	}
}
