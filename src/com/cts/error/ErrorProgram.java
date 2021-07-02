package com.cts.error;

public class ErrorProgram {

	void disp() {
		disp();// java.lang.StackOverflowError
	}
	
	public static void main(String[] args) {
		new ErrorProgram().disp();
		
//		ErrorProgram errorProgram=new ErrorProgram();
//		errorProgram.disp();
//		
		Exception e;
		
	}
}
