package sync;

public class AccountMain {

	public static void main(String[] args) {
		User1 user1 = new User1();
		 User2 user2 = new User2();

		Thread t1 = new Thread(user1);
		t1.setName("ram kumar");
//		Thread t2 = new Thread(user1);
		Thread t2 = new Thread(user2);
		t2.setName("suresh kumar");

		t1.start();
		t2.start();
	}
}

class User1 implements Runnable {
	synchronized void makewithdraw() {
		if (Account.balance <= 0)
			System.out
					.println("cannot withdraw " + Thread.currentThread().getName() + " balance is " + Account.balance);
		else {
			Account.withdraw(30);
			System.out.println(Thread.currentThread().getName() + " withdraws  30 " + " balance is " + Account.balance);
		}
	}

	synchronized void makedeposit() {
		Account.deposit(10);
		System.out.println(Thread.currentThread().getName() + " deposits  10 " + " balance is " + Account.balance);
		Account.deposit(10);
		System.out.println(Thread.currentThread().getName() + " deposits  10 " + " balance is " + Account.balance);
	}

	@Override
	public void run() {
		System.out.println(" initial  balance is " + Account.balance);
		makewithdraw();
		makewithdraw();
		makewithdraw();
		makewithdraw();

		makedeposit();
	}

}

class User2 implements Runnable {
	synchronized void makewithdraw() {
		if (Account.balance <= 0)
			System.out
					.println("cannot withdraw " + Thread.currentThread().getName() + " balance is " + Account.balance);
		else {
			Account.withdraw(30);
			System.out.println(Thread.currentThread().getName() + " withdraws  30 " + " balance is " + Account.balance);
		}
	}

	synchronized void makedeposit() {
		Account.deposit(10);
		System.out.println(Thread.currentThread().getName() + " deposits  10 " + " balance is " + Account.balance);
		Account.deposit(10);
		System.out.println(Thread.currentThread().getName() + " deposits  10 " + " balance is " + Account.balance);
	}

	@Override
	public void run() {
		System.out.println(" initial  balance is " + Account.balance);
		makewithdraw();
		makewithdraw();
		makewithdraw();
		makewithdraw();

		makedeposit();
	}
}