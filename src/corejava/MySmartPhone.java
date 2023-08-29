package corejava;

public class MySmartPhone  extends UserPhone implements 
                    Phone,BasicMobilePhone,SmartPhone{
	private String country;
    
	public String getCountry() {
		return country;
	}

	public MySmartPhone(int phoneId, String phoneModel, float phoneCost, String country) {
		super(phoneId, phoneModel, phoneCost);
		this.country = country;
	}

	@Override
	public void playVideo() {
		System.out.println("my smart phone plays video ");
	}

	@Override
	public void internetSurfing() {
		System.out.println("my smart phone has internet Surfing ");
	}

	@Override
	public void internetGaming() {
		System.out.println("my smart phone has internet Gaming ");
	}


	@Override
	public void internetBanking() {
		System.out.println("my smart phone has internet banking ");
	}


	@Override
	public void internetCall() {
		System.out.println("my smart phone has internet calling ");
	}


	@Override
	public void message() {
		System.out.println("my smart phone has messaging service ");
	}


	@Override
	public void call() {
		System.out.println("my smart phone has calling service ");
	}

	@Override
	public void userPhoneInfo() {
		System.out.println("my smart phone information ");
		System.out.println("\tid "+getPhoneId());
		System.out.println("\tmodel "+getPhoneModel());
		System.out.println("\tcost "+getPhoneCost());
	}
	
	public static void main(String[] args) {
		MySmartPhone mySmartPhone=new MySmartPhone(766776, "samsung", 20000, "india");
		mySmartPhone.userPhoneInfo();
		
		System.out.println("features in my phone");
		mySmartPhone.call();
		mySmartPhone.message();
		mySmartPhone.internetGaming();
		mySmartPhone.internetBanking();
		mySmartPhone.internetSurfing();
		mySmartPhone.internetCall();
		mySmartPhone.playVideo();
		
		//Phone.os="ios";
		
		System.out.println("my smart phone os is "+Phone.os);
		
	}
}
