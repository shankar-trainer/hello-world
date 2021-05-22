package corejava;

public class BankCustomer {

	 int id;// instance variable
	 String name;// instance variable
	
	 static String BankName = "HDFC";// static/class variable
	 static String Country = "India";// static/class variable
	
	BankCustomer(){
		id=78787; 
		name="mohan kumar";
	}
	
	public static void main(String[] args) {
		BankCustomer bankCustomer=new BankCustomer();
		
		System.out.println(bankCustomer.id);
		System.out.println(bankCustomer.name);
		
		System.out.println(BankName);
		System.out.println(Country);
	}

}
