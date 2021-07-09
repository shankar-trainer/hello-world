package org.cognizant.java8.lambda;

public interface Account {
  void deposit(int amt); 
  void withdraw(int amt);
  float intRate=5.6f;
}

class CurrentAccount{
	float balance;
	int actId;
	void actInfo() {
		System.out.println("Account id "+actId);
		System.out.println("Account balance "+balance);
	}
	//Account account=new Account();
	Account account1=new Account() {
		@Override
		public void withdraw(int amt) {
		 balance=balance-amt;
		}
		
		@Override
		public void deposit(int amt) {
			balance=balance+amt;
		}
	};
	
	public static void main(String[] args) {
	  CurrentAccount account=new  CurrentAccount();
	  account.actId=898899;
	  account.balance=12000;
	  account.actInfo();
	  
	  account.account1.deposit(1000);
	  System.out.println("after deposit the balance is "+account.balance);
	  
	  account.account1.withdraw(500);
	  System.out.println("after withdraw the balance is "+account.balance);
	 }
}

/*class SavingAccount implements Account{
	@Override
	public void deposit(int amt) {
	}

	@Override
	public void withdraw(int amt) {
	}
}*/