/**
 * Created by shankar on 4/6/2023.
 */

class Payment{

    private long paymentId;
    private float paymentAmt;
    private String paymentUserName;

    public Payment(long paymentId, float paymentAmt, String paymentUserName) {
        this.paymentId = paymentId;
        this.paymentAmt = paymentAmt;
        this.paymentUserName = paymentUserName;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentAmt=" + paymentAmt +
                ", paymentUserName='" + paymentUserName + '\'' +
                '}';
    }
}


class CashPayment  extends  Payment{


    public CashPayment(long paymentId, float paymentAmt, String paymentUserName) {
        super(paymentId, paymentAmt, paymentUserName);
    }
}

    public class Main {
        public static void main(String[] args) {
            CashPayment cashPayment=new CashPayment(54545,12000.0f,"aaa");
            System.out.println(cashPayment);
        }
}
