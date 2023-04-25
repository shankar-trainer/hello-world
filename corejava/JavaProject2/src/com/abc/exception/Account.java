package com.abc.exception;

/**
 * Created by shankar on 3/21/2023.
 */
public class Account {

    private int accountId;
    private  String accountName;
    private  float accountBalance;
    private String  accountLocation;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountLocation='" + accountLocation + '\'' +
                '}';
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) throws AccountException {
        if(accountId<=0)
            throw new AccountException("invalid account id cannot be zero or -ve");
        else if(accountId<10000 || accountId>50000)
            throw new AccountException("invalid account id must be in range of 10000 - 50000");

        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) throws AccountException {
        if(accountName.isEmpty())
            throw  new AccountException("name is empty");
        else if(accountName.length()<=10 || accountName.length()>=20)
            throw  new AccountException("account name must of of 10 -20 character");

        this.accountName = accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) throws AccountException {
        if(accountBalance<=0)
            throw new AccountException("balance  cannot be zero or -ve");

        this.accountBalance = accountBalance;
    }

    public String getAccountLocation() {
        return accountLocation;
    }

    public void setAccountLocation(String accountLocation) throws AccountException {
        if(accountLocation.isEmpty())
            throw  new AccountException("location is empty");
        else if(accountLocation.length()<=5 || accountLocation.length()>=15)
            throw  new AccountException("location must of of 5 - 15 character");

        this.accountLocation = accountLocation;
    }

    public void withdraw(float amount) throws AccountException {
        setAccountBalance(getAccountBalance()-amount);
    }

    public void deposit(float amount) throws AccountException {
        setAccountBalance(getAccountBalance()+amount);
    }

}
