package edu.chitkara;

interface BasicPhone {
	// String country;// all variable are by default public static final
	public static final String country = "India";

	void call();
}

interface BudgetPhone {
	public abstract void call();

	// all methods are public abstract
	void message();

	void game();
}

// multiple inheritance
interface SmartPhone extends BasicPhone, BudgetPhone {
	void videoCall();
	void gaming();
	void netsurfing();
}
public class MyPhone extends Customer implements BasicPhone, BudgetPhone, SmartPhone {

	public MyPhone(int customerId, String customerName, String emailId) {
		super(customerId, customerName, emailId);
	}

	@Override
	public void videoCall() {
		System.out.println("myphone has videoCall facility");
	}

	@Override
	public void gaming() {
		System.out.println("myphone has gaming facility");
	}

	@Override
	public void netsurfing() {
		System.out.println("myphone has netsurfing facility");
	}

	@Override
	public void message() {
		System.out.println("myphone has message facility");
	}

	@Override
	public void game() {
		System.out.println("myphone has gaming facility");
	}

	@Override
	public void call() {
		System.out.println("myphone has calling facility");
	};
	

	public static void main(String[] args) {
      MyPhone myPhone=new MyPhone(6776767,"anand kumar" , "india");
      
      System.out.println("Customer Information ");
      System.out.println("\tId"+myPhone.getCustomerId());  
      System.out.println("\tName"+myPhone.getCustomerName());  
      System.out.println("\tEmail Id"+myPhone.getEmailId());  
      
      System.out.println("\n Customer Phone  Features");
      myPhone.call();
      myPhone.message();
      myPhone.videoCall();
      myPhone.gaming();
      myPhone.netsurfing();
      //BasicPhone.country=""; // error 
      
      System.out.println("Phone manufactured at "+BasicPhone.country);
      
	}
}
