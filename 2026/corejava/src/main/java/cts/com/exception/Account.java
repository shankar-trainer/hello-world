package cts.com.exception;

public class Account {

    private int accountId;
    private String accountName;
    private String accountLocation;
    private float balance;



    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) throws AccountException {
        if(accountId<=0)
            throw new AccountException("invalid id it is zero or -ve ");
        else if(accountId<5000 || accountId>50000)
            throw new AccountException("invalid id must between 5000 - 50000 ");

        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) throws AccountException {
        if(accountName.isBlank())
            throw new AccountException("invalid name  it can be blank");
        else if(accountName.length()<5 || accountName.length()>15)
            throw new AccountException("invalid name,  length must of 5- 15 character");

        this.accountName = accountName;
    }

    public String getAccountLocation() {
        return accountLocation;
    }

    public void setAccountLocation(String accountLocation) throws AccountException {
        if(accountLocation.isBlank())
            throw new AccountException("invalid name  it can be blank");
        else if(accountLocation.length()<5 || accountLocation.length()>15)
            throw new AccountException("invalid name,  length must of 5- 15 character");

        this.accountLocation = accountLocation;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) throws AccountException {
        if(balance<=0)
            throw new AccountException("invalid balance it is zero or -ve ");
        else if(balance<1000 || balance>500000)
            throw new AccountException("invalid id must between 5000 - 50000 ");
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountLocation='" + accountLocation + '\'' +
                ", balance=" + balance +
                '}';
    }

}
