public abstract class Account {
    private int accntId;
    private String  accntName;
    private String  accntLocation;

    public Account(int accntId, String accntName, String accntLocation) {
        this.accntId = accntId;
        this.accntName = accntName;
        this.accntLocation = accntLocation;
    }

    public abstract void accountInfo();
    public abstract void deposit(float amount);
     public abstract void withdraw(float amount);

    public int getAccntId() {
        return accntId;
    }

    public String getAccntName() {
        return accntName;
    }

    public String getAccntLocation() {
        return accntLocation;
    }


}
