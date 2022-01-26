package edu.lpu.exception;

public class ErrorPrg1 {
	//StackOverflowError e;
  static void hello() {
	  hello();
  }
	public static void main(String[] args) {
	//Error e;
		hello();
}
}
