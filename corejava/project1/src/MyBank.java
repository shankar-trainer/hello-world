public class MyBank {
    private int regId;
    private String  name;
    private Payment payment;

    @Override
    public String toString() {
        return "MyBank{" +
                "regId=" + regId +
                ", name='" + name + '\'' +
                ", payment=" + payment +
                '}';
    }
    public static void main(String[] args) {
        MyBank myBank=new MyBank();
        myBank.regId=1;
        myBank.name="public bank";
        myBank.payment=Payment.card;
        System.out.println(myBank);
    }
}
