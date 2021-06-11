
public interface Phone {
	void call();
}

interface basicPhone extends Phone {
	String country = "India";

}

interface basicMobile extends Phone, basicPhone {

	void message();

	void playMusic();

	void playeRadio();
}

interface smartPhone extends Phone, basicPhone, basicMobile {

	void playVideo();

	void webBrowsing();

	void email();
}

abstract class myPhone {
	private int phoneId;
	private float cost;
	private String model;

	int getPhoneId() {
		return phoneId;
	}

	void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	float getCost() {
		return cost;
	}

	void setCost(float cost) {
		this.cost = cost;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}
}

class UserPhone extends myPhone implements Phone, basicMobile, basicPhone, smartPhone {

	@Override
	public void message() {
		System.out.println("you can message");
	}

	@Override
	public void playMusic() {
		System.out.println("you can play music");
	}

	@Override
	public void playeRadio() {
		System.out.println("you can play radio");
	}

	@Override
	public void call() {
		System.out.println("you can call");
	}

	@Override
	public void playVideo() {
		System.out.println("you can playVideo");
	}

	@Override
	public void webBrowsing() {
		System.out.println("you can do web browsing");
	}

	@Override
	public void email() {
		System.out.println("you can email");
	}

	public static void main(String[] args) {
		UserPhone phone = new UserPhone();
		phone.setPhoneId(6565656);
		phone.setModel("samsung galaxy");
		phone.setCost(34000);

		System.out.println("phone id is " + phone.getPhoneId());
		System.out.println("phone model is " + phone.getModel());
		System.out.println("phone cost is " + phone.getCost());
		phone.call();
		phone.message();
		phone.playeRadio();
		phone.playMusic();
		phone.playVideo();
		phone.webBrowsing();
		phone.email();
	}
}