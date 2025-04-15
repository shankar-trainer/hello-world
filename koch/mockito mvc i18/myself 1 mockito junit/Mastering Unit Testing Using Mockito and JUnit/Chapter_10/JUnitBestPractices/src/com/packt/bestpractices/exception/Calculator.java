package com.packt.bestpractices.exception;



public class Calculator {

	public int divide(int op1, int op2)  {
		return op1/op2;
	}
	
	public int sum(int... args) throws NumberOverflowException{
		int sum = 0;
		for(int val:args) {
			if(Integer.MAX_VALUE - sum < val) {
				throw new NumberOverflowException("Number overflow");
			}
			sum+=val;
		}
		
		return sum;
		
	}
}
class NumberOverflowException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public NumberOverflowException(String reason) {
		super(reason);
	}
}
