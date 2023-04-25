public class AccountManager {
	BankAccount account[];

	void create(int n, BankAccount account[]) {
		account = new BankAccount[n];
		for (int i = 0; i < account.length; i++) {
			this.account[i] = account[i];
		}
	}

	void delete() {
		for (int i = 0; i < account.length; i++) {
			this.account[i] = null;
		}
	}

	void deposit(float amt, BankAccount act) {
		act.add(amt);
	}

	void withdraw(float amt, BankAccount act) {
		act.subtract(amt);
	}

}
