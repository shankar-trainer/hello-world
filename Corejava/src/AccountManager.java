public class AccountManager {
	BankAccount account[];

	void create(int n, BankAccount account[]) {
		this.account = new BankAccount[n];
		for (int i = 0; i < account.length; i++) {
			this.account[i] = new BankAccount(account[i].accountNumber,
					account[i].balance,account[i].ownerName);
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
