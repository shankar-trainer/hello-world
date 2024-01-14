public interface  BankAccount {

	String location="noida";   
	// all variables are public static final
	String country="india";
	
	
	// all methods  are public abstract
	void  bankAccountInfo(); 
	
	void withdraw(float amt);
	void deposit(float amt);
	
}
