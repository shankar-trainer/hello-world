
public class SavingAccount extends Account {
    private int period;
    private String location;
    
	public SavingAccount(int actNo, String actName, float actBal, int period, String location) {
		super(actNo, actName, actBal);
		this.location=location;
		this.period=period;
	}

	
	@Override
	public String toString() {
		return 
				super.toString()
				
				+"\t\nperiod is "+period+
				"\t\nlocation is "+location
				;
	}
	
	@Override
	public void withdraw(int amt) {
       setActBal(getActBal()-amt);		
	}

	@Override
	public void deposit(int amt) {
		setActBal(getActBal()+amt);
	}

}
