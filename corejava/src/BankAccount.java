public class BankAccount {

	private int accountNo;
	private String customerName;
	private String transactionType;
	
	private float  tran_amount;
	private float balanace;
	
	public BankAccount(int accountNo, String customerName, String transactionType, float tran_amount, float balanace) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.transactionType = transactionType;
		this.tran_amount = tran_amount;
		this.balanace = balanace;
	} 
	
    public void transaction() {
    	if(this.transactionType.equals("deposit")) {
			deposit(tran_amount);
		}
		if(this.transactionType.equals("withdraw")) {
			withdraw(tran_amount);
		}
    }	
	
	public void deposit(float amt) {
		this.balanace=this.balanace+amt;
	}
	
	public void withdraw(float amt) {
		this.balanace=this.balanace-amt;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public float getTran_amount() {
		return tran_amount;
	}

	public float getBalanace() {
		return balanace;
	}
	
}
