class Savingbank extends MyBank{
    float intrate;
    int duration;
    
    @Override
    void bankInfo() {
		    System.out.println("Bank Information ");
		    System.out.println("\tId "+getBankId());
		    System.out.println("\tBalance "+getBankbalance());
		    System.out.println("\tName "+getBankName());
		    System.out.println("\tName "+getBankLocation());
		
		    System.out.println("\trate "+intrate);
		    System.out.println("\tduration "+duration);
		    System.out.println("\tInterest is "+interestCalculation());
    }
    
    
	@Override
	float interestCalculation() {
	   return intrate*getBankbalance()*duration;
	}
		
	@Override
	public String toString() {
		return super.toString()+"\n  Savingbank [intrate=" + intrate + ", duration=" + duration + "]";
	}


	public static void main(String[] args) {
		//MyBank bank=new MyBank();
	  Savingbank savingbank=new Savingbank();
	  savingbank.setBankId(9887);
	  savingbank.setBankbalance(25000);
	  savingbank.setBankLocation("madurai");
	  savingbank.setBankName("abc bank");
	  savingbank.intrate=0.05f;
	  
	  savingbank.duration=5;
	  
	  savingbank.deposit(5000);
	  savingbank.withdraw(2000);
	  savingbank.bankInfo();
	  //System.out.println(savingbank);
      //System.out.println("interest is "+ savingbank.interestCalculation());
	}
}
	
