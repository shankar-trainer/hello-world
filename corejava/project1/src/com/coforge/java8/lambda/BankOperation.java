package com.coforge.java8.lambda;

interface Account{
    void withdraw(float amt);
    void deposit(float amt);

    public default void  accountInfo(){
        System.out.println("account info ");
    }
    public static void  balanceInfo(){
        System.out.println("balance info ");
    }
}

public class BankOperation implements Account {

    @Override
    public void withdraw(float amt) {
    }

    @Override
    public void deposit(float amt) {
    }
}
