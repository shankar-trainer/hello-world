package com.montran.assignment.day4;

public abstract class BalanceComputer {
	static BalanceComputer balanceComputer;
	private float principalAmount;
	private float rate;
	private int time;

	public BalanceComputer(float principalAmount, float rate, int time) {
		super();
		this.principalAmount = principalAmount;
		this.rate = rate;
		this.time = time;
	}

	static BalanceComputer getBalanceComputer(char type) {
		   if(type=='C') {
                return balanceComputer;		
		   }
		   //if(type=='S')
	}

	abstract float  getBalance();
}

class BalanceComputerMain extends BalanceComputer {

	static BalanceComputer getBalanceComputer(char type) {
		   if(type=='C') {
             return balanceComputer;		
		   }
		   //if(type=='S')
		return balanceComputer;
	}


	
	public BalanceComputerMain(float principalAmount, float rate, int time) {
		super(principalAmount, rate, time);
	}

	public static void main(String[] args) {
    BalanceComputer balanceComputer=new BalanceComputerMain(12000,4.5f,3);
	}

	@Override
	float getBalance() {
		return 0;
	}
}
