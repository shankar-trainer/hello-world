package corejava;

public class BankCustomerClient {

	public static void main(String[] args) {
		
		BankCustomer bankCustomer=new BankCustomer();
		bankCustomer.id=-8879978;
		bankCustomer.name="abc";
		
		
		System.out.println(BankCustomer.BankName);
		System.out.println(BankCustomer.Country);
		
		System.out.println(bankCustomer.id);
		System.out.println(bankCustomer.name);
	}
}
