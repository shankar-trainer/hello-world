
public class AgricultureBank extends Bank {

	private int amount;

	public AgricultureBank(int bankRegNo, String bankName, float intRate, int amount) {
		super(bankRegNo, bankName, intRate);
		this.amount = amount;
	}

	/*
	 * @Override float intCalc(int amount,int time) { return
	 * amount*intRate*time/100; }
	 */

	@Override
	public String toString() {
		return "AgricultureBank [amount=" + amount + ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		AgricultureBank bank = new AgricultureBank(5455, "ag bank", 0.05f, 20000);
		System.out.println(bank);
		System.out.println("Interest is " + bank.intCalc(bank.amount, 4));
	}
}
