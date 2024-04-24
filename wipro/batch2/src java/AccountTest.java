public class AccountTest {
    public static void main(String[] args) {

        System.out.println(Math.PI);//Math have static PI,E variable and static sin method
        System.out.println(Math.E);
        System.out.println(Math.sin(Math.PI/2));

        Account account=new Account(10001,"suresh kumar",34000.0f);
        Account account1=new Account(10002,"umesh kumar",44000.0f);
        Account account2=new Account(10003,"sarvesh kumar",44000.0f);
        Account account3=new Account(10004,"priyesh kumar",39000.0f);

        System.out.println("Account Information ");
        System.out.println("\tInterest rate "+Account.getInterestRate());
        System.out.println("\tAccount id "+account.getAccountId());
        System.out.println("\tAccount  name "+account.getAccountName());
        System.out.println("\tAccount balance "+account.getAccountBalance());

        Account.accountInfo(account1);
        Account.accountInfo(account2);
        Account.accountInfo(account3);
    }
}
