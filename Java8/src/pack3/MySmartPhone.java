package pack3;

public class MySmartPhone extends MyPhone implements 
Phone,basicPhone,basicMobile, SmartPhone {

	@Override
	public void internet() {
	System.out.println("internet can be used");
	}

	@Override
	public void game() {
		System.out.println("game play  can be used");
	}

	@Override
	public void messageapp() {
		System.out.println("message app  can be used");
	}

	@Override
	public void videoplay() {
		System.out.println("videoplaye  can be used");
	}

	@Override
	public void officeapp() {
		System.out.println("office app   can be used");
	}

	@Override
	public void musicPlay() {
		System.out.println("music play  can be used");
	}

	@Override
	public void radioPlay() {
		System.out.println("radio play  can be used");
	}

	@Override
	public void message() {
		System.out.println("short messaging  can be used");
	}

	@Override
	public void call() {
		System.out.println("calling  can be used");
	}

	public static void main(String[] args) {
		MySmartPhone mySmartPhone=new MySmartPhone();
		mySmartPhone.call();
		mySmartPhone.internet();
		mySmartPhone.message();
		mySmartPhone.game();
		mySmartPhone.radioPlay();
		mySmartPhone.musicPlay();
		mySmartPhone.messageapp();
		mySmartPhone.officeapp();
		
		System.out.println("country is "+Phone.country);
		//Phone.country="nepal";
		
	}
}
