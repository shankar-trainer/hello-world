package com.capg.abstract1;

public interface Phone {
//public static final 	String country;
String country="India";
	//public abstract void call();
 void call();
}

interface BasicMobilePhone extends Phone {
	void message();

	void playAudio();
}

interface SmartPhone extends Phone, BasicMobilePhone {
	void videoPlay();

	void playInternet();

	void email();

	void playGame();
}

class UserPhone {
	private float cost;
	private int phoneRegNo;
	private int phoneModel;

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getPhoneRegNo() {
		return phoneRegNo;
	}

	public void setPhoneRegNo(int phoneRegNo) {
		this.phoneRegNo = phoneRegNo;
	}

	public int getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(int phoneModel) {
		this.phoneModel = phoneModel;
	}

}

class MySmartPhone extends UserPhone implements SmartPhone,Phone, BasicMobilePhone {

	@Override
	public void call() {
		System.out.println("phone call");
	}

	@Override
	public void message() {
		System.out.println("messaging");
	}

	@Override
	public void playAudio() {
		System.out.println("play audio file");
	}

	@Override
	public void videoPlay() {
		System.out.println("play video file");
	}

	@Override
	public void playInternet() {
		System.out.println("can surf internet");
	}

	@Override
	public void email() {
		System.out.println("can mail");
	}

	@Override
	public void playGame() {
		System.out.println("play online/offline game");
	}

	public static void main(String[] args) {
		MySmartPhone phone = new MySmartPhone();
		phone.call();
		phone.email();
		phone.message();
		phone.playAudio();
		phone.playInternet();
		phone.playGame();
		//phone.country="";
		System.out.println("made in "+Phone.country);
	}
}
