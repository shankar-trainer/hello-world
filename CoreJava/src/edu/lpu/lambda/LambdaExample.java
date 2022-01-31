/**
 * 
 */
package edu.lpu.lambda;

public final class LambdaExample {

	
	@FunctionalInterface
	interface Hello{// functional interface (single method)
		void disp();
	}
	
	public static void main(String[] args) {
	
		Hello hello=new Hello() {
			@Override
			public void disp() {
				System.out.println("hello ....");
			}
		};
		
		hello.disp();
		
		// lamda Expression 
	   Hello hello1=()->{
		 System.out.println("hello .....hi...");   
	   };
	   hello1.disp();
	}
}
