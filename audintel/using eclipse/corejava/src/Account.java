
public class Account {

	private long actNo;
	private String actName;
	private long actBalance;
	
	//private  final float interestRate=0.05f;//1.way initialize in the line 
	private  final float interestRate;     
	
/*	public Account() {
	  interestRate=0.06f;//2 way initialize in the constructor 
	}
*/
	public Account(long actNo, String actName, long actBalance, float interestRate) {
		this.actNo = actNo;
		this.actName = actName;
		this.actBalance = actBalance;
		this.interestRate = interestRate;
	}
	
	void accountInfo() {
		 System.out.println("\nAccount Information\n ");
		 System.out.println("\t Account No :"+actNo);
		 System.out.println("\t Account Name :"+actName);
		 System.out.println("\t Account Balance :"+actBalance);
		 System.out.println("\t Interest rate :"+interestRate);
	}
	// final method cannot be overridden
	public  final float interestCalculation() {
	  return actBalance*interestRate/100;	
	}
	
}
