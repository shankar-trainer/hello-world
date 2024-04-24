package com.wipro.exception;

public class Account {
    private int accountId;
    private String accountName;
    private float balance;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) throws AccountException {
        if (accountId <= 0)
            throw new AccountException("invalid id ");
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) throws AccountException {
        if (accountName.isBlank())
            throw new AccountException("invalid account name\taccount name is blank");
        this.accountName = accountName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) throws AccountException {
        if (balance<= 0)
            throw new AccountException("balance is -ve or zero ");
        this.balance = balance;
    }
    public void withdraw(float amt) throws NegativeAmountException {
        if(amt<=0)
            throw new NegativeAmountException("cannot withdraw zero or negative value");
        this.balance=this.balance-amt;
    }
    public void deposit(float amt)throws NegativeAmountException{
        if(amt<=0)
            throw new NegativeAmountException("cannot deposit zero or negative value");
        this.balance=this.balance+amt;
    }
}
