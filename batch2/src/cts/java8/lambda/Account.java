package cts.java8.lambda;

public interface Account {
   public void deposit(float amt);
}

class SavingAccount {
	float balance;
	
	Account account=new Account() {
		@Override
		public void deposit(float amt) {
	     balance=balance+amt;		
		}
	};
	
	public static void main(String[] args) {
		SavingAccount account1=new SavingAccount();
		account1.balance=10000;
		account1.account.deposit(1200);
		System.out.println(account1.balance);
	}
}