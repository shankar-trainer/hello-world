public class SavingAccount extends Account{

    private int time;
    private String location;

    public SavingAccount(int actId, String actName, float balance, float rate, int time, String location) {
        super(actId, actName, balance, rate);
        this.time = time;
        this.location = location;
    }

    public int getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }
    /*@Override
    public void deposit(float amt) {
        super.deposit(amt);
    }

    @Override
    public void withdraw(float amt) {
        super.withdraw(amt);
    }*/

    @Override
    public float interest() {
        return getRate()*getBalance()*time;
    }

}
