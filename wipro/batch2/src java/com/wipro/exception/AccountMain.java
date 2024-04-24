package com.wipro.exception;

public class AccountMain {
    public static void main(String[] args) {
        System.out.println("program starts ");
        Account account = new Account();
        try {
            account.setAccountId(656560);
            account.setAccountName(" ram ");
            account.setBalance(10000);
            System.out.println("Account Details ");
            System.out.println("\tId is : " + account.getAccountId());
            System.out.println("\tName is : " + account.getAccountName());
            System.out.println("\tBalance  is : " + account.getBalance());

            account.deposit(0);
            System.out.println("after deposit balance is "+account.getBalance());
            account.withdraw(-100);
            System.out.println("after withdraw  balance is "+account.getBalance());

        } catch (AccountException|NegativeAmountException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("program ends ");
    }
}
