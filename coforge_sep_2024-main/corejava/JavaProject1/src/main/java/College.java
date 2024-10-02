public class College {

    private int regNo;
    private String collegeName;
    private float fund;

    public College(int regNo, String collegeName, float fund) {
        this.regNo = regNo;
        this.collegeName = collegeName;
        this.fund = fund;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public float getFund() {
        return fund;
    }

    void fundExpense(float amt){
        fund=fund-amt;
    }

}
