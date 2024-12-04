package com.coforge.exception;

public class Account {
    private int accountNo;
    private String accountName;
    private float balance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) throws AccountException {
        if(accountNo<=0)
            throw new AccountException("account no can not be -ve or zero");
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) throws AccountException {
        if(accountName.isBlank())
            throw new AccountException("account name is blank");
        else if(accountName.length()<5 || accountName.length()>15)
            throw new AccountException("account name length  must of 5 -15 chars ");

        this.accountName = accountName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) throws AccountException {
        if(balance<=0)
            throw new AccountException("account balance not be -ve or zero");
        this.balance = balance;
    }
}
