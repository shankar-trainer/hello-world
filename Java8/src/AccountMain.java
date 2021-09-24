
public class AccountMain {

	public static void main(String[] args) {
		Account account1 = new Account(3424343, "kamles gupta", 23000);
		Account account2 = new Account(33234242, "amresh sharma", 56000);

		Account account3 = new Account(656565, "vimalesh kant", 34000);
		Account account4 = new Account(54565, "amar kumar", 67000);

		Account.Info();

		account1.accountInfo();
		account2.accountInfo();
		
		
		Account.setCountry("srilanka");
		Account.setInterestRate(0.07f);

		
		account3.accountInfo();
		account4.accountInfo();

	}
}
