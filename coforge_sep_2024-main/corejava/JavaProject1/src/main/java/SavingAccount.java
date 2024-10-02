public class SavingAccount extends  Account {
    private float rate;
    private int time;

    @Override
    float interestCalculation() {
        return getBalance()*rate*time;
    }

    @Override
    void accountInformation() {
        System.out.println("\nAccount Information ");
        System.out.println("\t account id "+getAccountId());
        System.out.println("\t name "+getName());
        System.out.println("\t balance "+getBalance());
        System.out.println("\t rate "+getRate());
        System.out.println("\t time "+getTime());
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

}
