
public interface Phone {
	String imei = "4554554";

// public static final	String imei;// by compiler
	void call();
// public abstract void call();// by compiler 

}

interface BudgetMobile extends Phone {
	void message();
}

interface SmartPhone extends Phone, BudgetMobile {
	void videocall();

	void email();
}

class BasicPhone {
	private int phoneId;
	private String phoneModel;
	private float phonecost;

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public float getPhonecost() {
		return phonecost;
	}

	public void setPhonecost(float phonecost) {
		this.phonecost = phonecost;
	}

}

class myPhone extends BasicPhone implements Phone, BudgetMobile, SmartPhone {

	
	@Override
	public void videocall() {
       System.out.println("video call ");
	}

	@Override
	public void email() {
    System.out.println("email ");
	}

	@Override
	public void message() {
     System.out.println("sms n mms");
	}

	@Override
	public void call() {
    System.out.println("voice call");
	}

	public static void main(String[] args) {
		myPhone myPhone=new myPhone();
		myPhone.setPhonecost(20000);
		myPhone.setPhoneId(67776766);
		myPhone.setPhoneModel("poco 3");
	
		System.out.println("Phone information");
		System.out.println("\n\tid"+myPhone.getPhoneId());
		System.out.println("\n\tmodel"+myPhone.getPhoneModel());
		System.out.println("\n\tcost"+myPhone.getPhonecost());
		System.out.println("\n\timei"+Phone.imei);
		
		System.out.println("phone features ");
		
		myPhone.email();
		myPhone.call();
		myPhone.message();
		myPhone.videocall();
	}
}