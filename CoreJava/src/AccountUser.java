
public class AccountUser {

	private int userId;
	private String userName;
	private float intRate;
	private float balance;

	public void userInfo() {
		System.out.println("User id " + userId);
		System.out.println("User Name " + userName);
		System.out.println("User interest Rate " + intRate);
		System.out.println("User balance is  " + balance);
	}

	public  final float intCalculation() {
		return balance * intRate;
	}

	public AccountUser(int userId, String userName, float intRate, float balance) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.intRate = intRate;
		this.balance = balance;
	}

}
