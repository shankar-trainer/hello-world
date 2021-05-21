
package com.cts.inner;

@FunctionalInterface
interface Phone {
	void call();
}

public class Hello {

	public static void main(String[] args) {
		Phone phone = new Phone() {

			@Override
			public void call() {
				System.out.println("call by phone");
			}
		};
		
		phone.call();
	}
}
@FunctionalInterface
interface Calculation{
	int addition(int a, int b);
}
class Hello1{
	
	public static void main(String[] args) {
	
		Phone phone= ()->{System.out.println(" call by phone ");};
		phone.call();
	
		Calculation calculation=(x,y)-> x+y;
		
		System.out.println(calculation.addition(11, 22));
	}
}