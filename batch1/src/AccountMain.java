
public class AccountMain {

	public static void main(String[] args) {
		Account  account=new Account(77879, "mohan kumar",25000);
		System.out.println(account.getActId());
		System.out.println(account.getActName());
		System.out.println(account.getActSalary());
		System.out.println(Account.getBankName());
	}
}
