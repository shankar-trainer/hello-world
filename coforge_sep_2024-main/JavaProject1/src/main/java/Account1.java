public abstract class Account1 {
    protected int accountNumber;
    protected Customer1 customerObj;
    protected double balance;

    public Account1(int accountNumber, Customer1 customerObj, double balance) {
        this.accountNumber = accountNumber;
        this.customerObj = customerObj;
        this.balance = balance;
    }
   public  abstract  boolean withdraw(double amount);
}
