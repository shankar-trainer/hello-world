public class Account {

    private int actId;
    private  String actName;
    private float balance;
    //private final float rate=0.05f; //inline  initialization
    private final float rate;

    // final rate  with constructor initialization
    public Account(int actId, String actName, float balance, float rate) {
        this.actId = actId;
        this.actName = actName;
        this.balance = balance;
        this.rate = rate;
    }

    public int getActId() {
        return actId;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getRate() {
        return rate;
    }
    public final  void withdraw(float amt){
        //balance=balance-amt;
        setBalance(getBalance()-amt);
    }
    public final void deposit(float amt){
        //balance=balance+amt;
        setBalance(getBalance()+amt);
    }

    public float interest(){
        return  balance*rate;
    }

    public static void main(String[] args) {
        Account account=new Account(10001,"suman kumar",90000,4.6f);
        //account.rate=0.07f;// error
    }


}
