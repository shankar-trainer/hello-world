
public class SavingBankMain {

	public static void main(String[] args) {
		
	  SavingBank bank=new SavingBank(30000, 0.05f, 6, "noida");
	  bank.bankInfo();
	  System.out.println("Interest is "+bank.interest());
	}
}
