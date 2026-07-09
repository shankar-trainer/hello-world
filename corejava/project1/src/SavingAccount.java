public class SavingAccount  extends  Account{
    private String state;
    private float balance;

    public SavingAccount(int accntId, String accntName, String accntLocation, String state, float balance) {
        super(accntId, accntName, accntLocation);
        this.state = state;
        this.balance = balance;
    }

    public String getState() {
        return state;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public void accountInfo() {
        System.out.println("saving account info ");
        System.out.println( "\t id "+getAccntId());
        System.out.println( "\t name "+getAccntName());
        System.out.println( "\t location "+getAccntLocation());
        System.out.println( "\t state "+getState());
        System.out.println( "\t balance "+getBalance());
    }

    @Override
    public void deposit(float amount) {
      setBalance(getBalance()+amount);
    }

    @Override
    public void withdraw(float amount) {
        setBalance(getBalance()-amount);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        SavingAccount account=new SavingAccount(12344,"amit kumar","delhi","up", 20000);
        account.accountInfo();

        account.deposit(1000);
        System.out.println("after deposit balance is "+account.getBalance());
        account.withdraw(200);
        System.out.println("after withdraw balance is "+account.getBalance());

    }

}
