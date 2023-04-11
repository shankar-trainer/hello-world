public class UserPhone extends MyPhone implements Phone1, BasicMobile, BasicPhone, SmartPhone {
	private int warrantyYear;
	private String insurance;
	
	@Override
	public String toString() {
		return "UserPhone [warrantyYear=" + warrantyYear + ", insurance=" + insurance + "]";
	}
	public UserPhone(int phoneId, String phoneModel, float phonePrice, int warrantyYear, String insurance) {
		super(phoneId, phoneModel, phonePrice);
		this.warrantyYear = warrantyYear;
		this.insurance = insurance;
	}
	public int getWarrantyYear() {
		return warrantyYear;
	}

	public void setWarrantyYear(int warrantyYear) {
		this.warrantyYear = warrantyYear;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}


	@Override
	public void message() {
		System.out.println("Phone has messaging facility");
	}

	@Override
	public void playMusic() {
		System.out.println("phone has music play facility");
	}

	@Override
	public void call() {
		System.out.println("phone has calling  facility");
	}

	@Override
	public void chatApp() {
		System.out.println("phone has chatting facility");
	}

	@Override
	public void netSurfing() {
		System.out.println("phone has net surfing facility");
	}

	@Override
	public void bankApplication() {
		System.out.println("phone has bank application facility");
	}

	@Override
	public void emailApp() {
		System.out.println("phone has email facility");

	}

	@Override
	public void gaming() {
		System.out.println("phone has gaming facility");
	}

	@Override
	public void videoPlay() {
		System.out.println("phone has video play facility");
	}

}
