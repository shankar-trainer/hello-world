package corejava;

public class AccountMain {
	public static void main(String[] args) {
		Account account=new Account();
		account.setBalance(10000);
		System.out.println("initial balance "+account.getBalance());
		
		account.deposit(2000);
		System.out.println(" balance after deposit "+account.getBalance());
		
		account.withdraw(18000);
		System.out.println(" balance after withdraw "+account.getBalance());
		
		
	}
}
