import javax.swing.JFrame;

public interface Phone {
	 String country="india";
	//public static final String country = "India";

	// void call();
	public abstract void call();
}

interface basicPhone {
	void message();
}

interface basicMobile {
	void playAudio();
	void playVideio();
}

interface SmartPhone extends Phone, basicPhone, basicMobile // multiple
{

}

class UserPhone extends Person1 implements SmartPhone, Phone {

	@Override
	public void message() {
		System.out.println("messaging");
	}

	@Override
	public void playAudio() {
		System.out.println("play audio");
	}

	@Override
	public void playVideio() {

		System.out.println("play video");
	}

	@Override
	public void call() {
		System.out.println("calling ");
	}

	public static void main(String[] args) {
		UserPhone phone = new UserPhone();
		phone.call();
		phone.playVideio();
		phone.playAudio();
		phone.message();
		
		//Phone.country="abc";
		
		System.out.println(Phone.country);

	}
}
