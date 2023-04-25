
public class Bank {

	public static void main(String[] args) {
		AccountManager accountManager=new AccountManager();
		
		BankAccount account[]=new BankAccount[5];
		    account[0]=new BankAccount(21212,2000,"pawan kumar");
		    account[1]=new BankAccount(21217,1000,"suman kumar");
		    account[2]=new BankAccount(21218,1500,"lata sinha");
		    account[3]=new BankAccount(21219,8000,"simran agarwal");
		    account[4]=new BankAccount(21210,9000,"raman kumar");

       accountManager.create(5, account);
  account[3].add(560);
  account[4].subtract(1500);
       
       for (BankAccount bankAccount : account) {
    	   System.out.println("Account information ");
		System.out.println("\taccount  number "+bankAccount.accountNumber);
		System.out.println("\towner name "+bankAccount.ownerName);
		System.out.println("\tbalance "+bankAccount.balance());
	}
       
		    
	}
}
