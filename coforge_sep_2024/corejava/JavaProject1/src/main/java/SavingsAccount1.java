public class SavingsAccount1 extends Account1 {

    private double minimumBalance;

    public SavingsAccount1(int accountNumber, Customer1 customerObj, double balance, double minimumBalance) {
        super(accountNumber, customerObj, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) > minimumBalance) {
             this.balance=this.balance-amount;
            return true;
        }
        return false;
    }
}
class SavingAccount1{
    public static void main(String[] args) {
        Customer1 customer1=new Customer1(1,"raju kumar","raju@gmail.com");

  SavingsAccount1 savingsAccount1=new SavingsAccount1(1001,customer1,20000,5000);

        System.out.println(savingsAccount1.balance);
        System.out.println("withdraw of 16000" + savingsAccount1.withdraw(16000));
        System.out.println("withdraw of 1000" + savingsAccount1.withdraw(1000));


    }
}
