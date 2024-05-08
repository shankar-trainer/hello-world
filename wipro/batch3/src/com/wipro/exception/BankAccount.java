package com.wipro.exception;

public class BankAccount {
    private long accountNo;
    private String accountHolderName;
    private float accountBalance;
    private String accountType;

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) throws BankAccountException {
        if (accountNo <= 0)
            throw new BankAccountException("account no is <=0");

        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) throws BankAccountException {
        if (accountHolderName.isEmpty())
            throw new BankAccountException("account name can not be empty");
        else if (accountHolderName.length() < 5 || accountHolderName.length() > 15)
            throw new BankAccountException("account name length must be between 5 char to 15 chars  ");
        this.accountHolderName = accountHolderName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) throws BankAccountException {
        if (accountBalance <= 0)
            throw new BankAccountException("account balance can not be  <=0");
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) throws BankAccountException {
        if (!accountType.equalsIgnoreCase("saving") || !accountType.equalsIgnoreCase("current"))
            throw new BankAccountException("acount type muse be either saving or current");
        this.accountType = accountType;
    }

    public void deposit(float amt) throws BankAccountException {
        if (amt <= 0)
            throw new BankAccountException("cannot deposit 0 or negative amount");
        this.accountBalance = this.accountBalance + amt;
    }

    public void withdraw(float amt) throws BankAccountException {
        if (amt <= 0)
            throw new BankAccountException("cannot withdraw 0 or negative amount");
        this.accountBalance = this.accountBalance - amt;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo=" + accountNo +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
