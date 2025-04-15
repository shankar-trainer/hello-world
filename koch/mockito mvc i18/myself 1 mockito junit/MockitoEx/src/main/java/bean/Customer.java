    package bean;

    public class Customer {

        private int cid;
        private String  cname;
        private float  csalary;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public float getCsalary() {
        return csalary;
    }

    public void setCsalary(float csalary) {
        this.csalary = csalary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", csalary=" + csalary +
                '}';
    }
}
