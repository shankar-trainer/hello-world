
public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account();
		account.setBalance(2000);
		account.deposit(500);
		account.withdraw(1800);
		System.out.println(account.getBalance());
	}
}
