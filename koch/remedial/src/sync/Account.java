package sync;

public class Account {
  static   float balance=100;

   static   void withdraw(int amount){
        balance=balance-amount;
    }

    static   void  deposit(int amount){
        balance=balance+amount;
    }

}
