
public abstract class Bank {

	private int accountNo;
	private String accountName;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public abstract void  bankInfo();// abstract method has no body
	                                 //abstract method is defined inside abstract class
		
}
