
public class Payment {
	private int paymentId; // instance variable
	private String paymentUserName;// instance variable
	private float paymentAmt;// instance variable
	private static String state;// class variable
	private static String country;// class variable

	static {
		state = "punjab";
		System.out.println("static block1 called");
	}
	static {
		country = "india";
		System.out.println("static block2 called");
	}

	public Payment() {
		this.paymentId = 99898;
		this.paymentUserName = "surendra kumar";
		this.paymentAmt = 6000;
		System.out.println("constructor called ");
	}

	void paymentInfo() {
		System.out.println("payment information");
		System.out.println("\tId is " + paymentId);
		System.out.println("\tUser name is " + paymentUserName);
		System.out.println("\tAmount is " + paymentAmt);
	}
	static void paymentInfo1(Payment payment) {
		System.out.println("payment information");
System.out.println("\tId is " + payment.paymentId);
System.out.println("\tUser name is " + payment.paymentUserName);
System.out.println("\tAmount is " + payment.paymentAmt);
	}
	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.paymentInfo();
		paymentInfo1(payment);
	}
}
