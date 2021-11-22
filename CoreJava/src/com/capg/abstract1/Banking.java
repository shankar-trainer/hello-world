package com.capg.abstract1;

public interface Banking {
  
	float rate=0.05f;
	String country="India";
	
	float interestCalculation();
    // no instance variable,instance method 	
}

class SavingBank extends AccountInfo implements  Banking{
   private int time;
	@Override
	public float interestCalculation() {
		return rate*time*getBalance();
	}
	
}
class CurrentBank extends AccountInfo implements  Banking{
	
	@Override
	public float interestCalculation() {
		   // compound Interest Method  
		return 0;
	}
	
}