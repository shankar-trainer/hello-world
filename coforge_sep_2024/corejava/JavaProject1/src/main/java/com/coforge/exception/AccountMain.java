package com.coforge.exception;

public class AccountMain {
    public static void main(String[] args) {
        Account account=new Account();

        try {
            account.setAccountId(1900);
            //account.setAccountName("rameshswar kumar verma");
            account.setAccountName("ram kumar verma");
            account.setBalance(1000);
            System.out.println(account);

        } catch (AccountException e) {
            System.err.println(e.getMessage());
        }

    }
}
