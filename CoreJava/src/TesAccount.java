
public class TesAccount {

	public static void main(String[] args) {
		Account account=new Account();
		account.setBalance(2000);
		
		System.out.println("balance is "+account.getBalance());
		
		account.deposit(500);
		account.withdraw(1800);

		System.out.println("balance is "+account.getBalance());
	}
}
