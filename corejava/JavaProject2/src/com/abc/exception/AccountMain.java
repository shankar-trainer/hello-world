package com.abc.exception;

/**
 * Created by shankar on 3/21/2023.
 */
public class AccountMain {

    public static void main(String[] args) {
        Account account=new Account();
        Object o;
        try {
            account.setAccountId(10000);
            account.setAccountName("ram kumar verma");
            account.setAccountLocation("new delhi");
            account.setAccountBalance(2000);

            System.out.println("account information ");
            System.out.println(account);

            System.out.println("withdrawing amount ");
            account.withdraw(40000);
            System.out.println("after withdraw balance is "+account.getAccountBalance());

            //System.out.println("account information ");
            //System.out.println("\tid " + account.getAccountId());
            //System.out.println("\tname " + account.getAccountName());
            //System.out.println("\tlocation " + account.getAccountLocation());

            //System.out.println("\tbalance " + account.getAccountBalance());
        }
        catch (AccountException e){
            System.out.println(e.getMessage());
            //System.err.println(e.getMessage());
        }
    }
}
