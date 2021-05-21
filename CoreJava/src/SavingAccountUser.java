
public class SavingAccountUser extends AccountUser {

	private String uType;

	public SavingAccountUser(int userId, String userName, float intRate, float balance, String uType) {
		super(userId, userName, intRate, balance);
		this.uType = uType;
	}
	
	@Override
	public void userInfo() {
		super.userInfo();
		System.out.println("User Type is "+uType);
		System.out.println("Interest is "+intCalculation());
	}
	
/*	@Override
	public float intCalculation() {
		// TODO Auto-generated method stub
		return super.intCalculation();
	}
*/
	
	public static void main(String[] args) {
		SavingAccountUser accountUser=new SavingAccountUser(5557, "pankaj kumar", 0.05f, 20000,"saving");
		accountUser.userInfo();
		
	}
}
