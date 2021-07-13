package org.cognizant.thread;

public class BankAccountMain {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			bankAccount bankAccount = new bankAccount(12000);
			System.out.println("Bank balance " + bankAccount.getBalance());
			bankAccount.deposit(1000);
			System.out.println("After deposit bank balance " + bankAccount.getBalance());
			bankAccount.withdraw(500);
			System.out.println("After withdraw bank balance " + bankAccount.getBalance());
		};

		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);

		t1.start();
		t2.start();
		t3.start();

	}
}
