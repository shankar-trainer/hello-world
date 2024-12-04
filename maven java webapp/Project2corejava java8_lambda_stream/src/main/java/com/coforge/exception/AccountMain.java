package com.coforge.exception;

public class AccountMain {
    public static void main(String[] args) {
        try {
            Account account = new Account();
            //account.setAccountNo(0);
            account.setAccountNo(8777);
            //account.setAccountName("");
            account.setAccountName("shyam kumar");
            account.setBalance(-8999);
           // account.setBalance(8999);

            System.out.println("account information ");
            System.out.println("\taccount no " + account.getAccountNo());
            System.out.println("\taccount name " + account.getAccountName());
            System.out.println("\tbalance " + account.getBalance());
        }
        catch (AccountException e){
            System.err.println(e);
        }
    }
}
