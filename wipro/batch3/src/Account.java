public class Account {
    private int accountId;
    private  String  accountName;
    private float accountBalance;

    public Account(int accountId, String accountName, float accountBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public float getAccountBalance() {
        return accountBalance;
    }
    public void accountDetails(){
        System.out.println("\naccount data");
        System.out.println("\tid :"+getAccountId());
        System.out.println("\tname :"+getAccountName());
        System.out.println("\tbalance :"+getAccountBalance());
    }
}
