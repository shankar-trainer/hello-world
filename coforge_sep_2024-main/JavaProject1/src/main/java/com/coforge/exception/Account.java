package com.coforge.exception;

public class Account {
    private long accountId;
    private String accountName;
    private float balance;

    public long getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void setAccountId(long accountId) throws AccountException {
        if(accountId<=0)
            throw new AccountException("accountId can not be -ve or zero");
        else if(accountId<1000 || accountId>10000)
            throw new AccountException("accountId must be in the range 1000 - 10000");
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) throws AccountException {
        if(accountName.isBlank())
            throw new AccountException("account Name cannot be blank or have blank spaces");
        else if(accountName.length()<5 || accountName.length()>15)
            throw new AccountException("account Name length must of 5 - 15 characters");
        this.accountName = accountName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) throws AccountException {
        if(balance<=0)
            throw new AccountException("account bacalnce can not be -ve or zero");
        this.balance = balance;
    }
}
