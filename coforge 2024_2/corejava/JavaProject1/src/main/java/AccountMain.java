public class AccountMain {
    public static void main(String[] args) {
         //Account account=new Account(); // error
        //Account account=new SavingAccount();
        SavingAccount account1=new SavingAccount();
        account1.setAccountId(10001);
        account1.setName("ramesh kumar");
        account1.setBalance(20000);
        account1.setRate(0.05f);
        account1.setTime(12);

        account1.accountInformation();
        System.out.println("Interest amount is "+account1.interestCalculation());
    }

}
/*
abstract class gives abstraction features

abstraction features:
   class should have abstract/ essential methods

   abstract methods can be added in abstract class
   abstract method has no body/no implmentation

   abstract class have both methods abstract and concrete methods

   abstract class can not be instantiated


 */