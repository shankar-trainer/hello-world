class AccountUser {
	int id;
	String name;
}

public interface Account {

	// void withdraw(); // converted as below
	public abstract void withdraw(int amt);

	public void deposit(int amt);

	String country = "India";
	// converted as below
	// public static final Country;
}

interface AccountDepartment {
	String location = "delhi";
	void userRegistration(AccountUser user);
}

class userAccount implements Account, AccountDepartment {
	float amount;

	@Override
	public void userRegistration(AccountUser user) {
		System.out.println("Registration of id " + user.id);
		System.out.println("Registration name " + user.name);
	}

	@Override
	public void withdraw(int amt) {
		amount = amount - amt;
	}

	@Override
	public void deposit(int amt) {
		amount = amount + amt;
	}

	public static void main(String[] args) {
		userAccount useract = new userAccount();
		useract.amount = 90000;

		System.out.println("initial balance is " + useract.amount);
		useract.deposit(5000);
		System.out.println("after deposit balance is " + useract.amount);

		useract.withdraw(9000);
		System.out.println("after withdraw balance is " + useract.amount);

		AccountUser user1 = new AccountUser();
		user1.id = 7887878;
		user1.name = "umesh parasad";

		useract.userRegistration(user1);
		//Account.country="";
		
		System.out.println("Account country is "+Account.country);
		System.out.println("Department location  is "+AccountDepartment.location);

	}
}
