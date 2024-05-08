public class AccountMain {
    public static void main(String[] args) {
        Account account1=new Account(10001,"suresh kumar",20000);
        Account account2=new Account(10002,"umesh kumar",25000);
                    // two reference variable , two object
        System.out.println("account1 ");
        account1.accountDetails();
        System.out.println("account2 ");
        account2.accountDetails();

        System.out.println("account3 ");
                    // three reference variable , two object
        Account account3=account2; // account2, account3 both refers same object
        account3.accountDetails();
        account3.setAccountId(1);
        account3.setAccountBalance(90000);
        System.out.println("after change in account3  account 2 is  ");
        account2.accountDetails();
    }
}
