
public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account();
		account.setBalance(2000);
		System.out.println("bank balance is "+account.getBalance());
		
		account.deposit(500);
		
		System.out.println("after deposit bank balance is "+account.getBalance());
		
		account.withdraw(1800);
		
		System.out.println("after withdraw bank balance is "+account.getBalance());
		
		account.withdraw(1800);
		
		System.out.println("after withdraw bank balance is "+account.getBalance());
		
	}
}
