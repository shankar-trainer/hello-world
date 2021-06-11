package com.cts.inner;

public class lambdaEx1 {

	interface bank {
		void withdraw();
	}

	interface Addition {
		int sum(int a, int b);
	}

	public static void main(String[] args) {

		bank b=()->{
			System.out.println("withdraw function");
		};
		b.withdraw();
		Addition addition=(x,y)-> x+y;
			
		System.out.println(addition.sum(11, 22));
		
		
	}
}
