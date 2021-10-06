package org.com;

public class Test1 {

	static void disp(){
		disp();
		
	}
	public static void main(String[] args) {
		//java.lang.StackOverflowError
		disp();
		
	}
}
