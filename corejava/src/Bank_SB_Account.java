
public class Bank_SB_Account {

	String customer_name, trans_type;
	float trans_amount, bal_amount;
	int acct_no;

	public Bank_SB_Account(int acct_no,String customer_name, String trans_type, float trans_amount, float bal_amount) {
		super();
		this.customer_name = customer_name;
		this.trans_type = trans_type;
		this.trans_amount = trans_amount;
		this.bal_amount = bal_amount;
		this.acct_no = acct_no;
	}

	void transaction() {
		if (trans_type.equals("deposit"))
			bal_amount = bal_amount + trans_amount;
		if (trans_type.equals("withdrawl"))
			bal_amount = bal_amount - trans_amount;
	}

}
