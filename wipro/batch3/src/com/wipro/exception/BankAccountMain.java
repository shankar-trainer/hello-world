package com.wipro.exception;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account=new BankAccount();

        try {
            account.setAccountNo(0);
            account.setAccountBalance(-900);
            account.setAccountHolderName("");
            account.setAccountType("abc");

            System.out.println("Bank account details ");
            System.out.println(account);
            account.deposit(-1999);
            System.out.println("after deposit balance is "+account.getAccountBalance());
            account.withdraw(-1999);
            System.out.println("after withdraw balance is "+account.getAccountBalance());

        } catch (BankAccountException e) {
            System.err.println(e.getMessage());
            //throw new RuntimeException(e);
        }


    }
}
