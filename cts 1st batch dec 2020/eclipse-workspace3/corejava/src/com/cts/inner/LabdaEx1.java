package com.cts.inner;

interface Calculation {
	float addition(int a, int b);
}

interface Hello1 {
	void disp();
}

public class LabdaEx1 {

//	Calculation calculation=new Calculation() {
//		@Override
//		public float addition(int a, int b) {
//			return a+b;
//		}
//	};

	public static void main(String[] args) {

		Calculation calculation1 = (x, y) -> x + y;

		Hello1 hello1 = () -> {
			System.out.print("\nhi ...");
		};

		System.out.println(calculation1.addition(12, 16));

		hello1.disp();
	}

}
