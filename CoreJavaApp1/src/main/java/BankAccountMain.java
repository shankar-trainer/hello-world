
public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(1001, "aman sharma", "Current",
				5000);

		try {
			account.deposit(150);
			System.out.println(account.getBalance());
			account.withdraw(15000);
			System.out.println(account.getBalance());
			
		} catch (InsufficientFunds | NegativeAmount | LowBalanceException e) {
			System.err.println(e);
		}
	}
}
