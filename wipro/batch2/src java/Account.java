public class Account {

    private int accountId;  // instance or non-static variable
    private String accountName;// instance or non-static variable
    private float accountBalance;// instance or non-static variable
    // all objects will have different copy of instance variable

    private static float interestRate;// static or class variable
    // single copy will be shared to all objects

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public static float getInterestRate() {
        return interestRate;
    }

    // constructor is used for initialization of instance variable
    public Account(int accountId, String accountName, float accountBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        System.out.println("constructor called");
    }

    // static block is used to initialize static members
    static {
        interestRate = 0.05f;
        System.out.println("static block called");
    }

     static void  accountInfo(Account account){
         System.out.println("\nAccount Information ");
         System.out.println("\tInterest rate "+interestRate);
         System.out.println("\tAccount id "+account.accountId);
         System.out.println("\tAccount  name "+account.accountName);
         System.out.println("\tAccount balance "+account.accountBalance);
     }
      // non static/instance method can access static, non-static directly
      void  accountInfo1(){
         System.out.println("\nAccount Information ");
         System.out.println("\tInterest rate "+interestRate);
         System.out.println("\tAccount id "+accountId);
         System.out.println("\tAccount  name "+accountName);
         System.out.println("\tAccount balance "+accountBalance);
     }

    // static method can call static members directly
    // static method can access non static/instance variable using object
    public static void main(String[] args) {
      Account account=new Account(10001,"suresh kumar",34000.0f);
        System.out.println("Account Information ");
        System.out.println("Interest rate "+interestRate);
        System.out.println("Interest rate "+Account.interestRate);
        System.out.println("Account id "+account.accountId);
        System.out.println("Account  name "+account.accountName);
        System.out.println("Account balance "+account.accountBalance);
    }
}
