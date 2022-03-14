package com.capg.beans;
                                //1 class              // multiple interfaces
public class SmartPhone  extends AndroidPhone implements Phone, basicMobile,BasicPhone{

	@Override
	public void message() {
	 System.out.println("message service is present");
	}

	@Override
	public void playAudio() {
		System.out.println("audio play service is present");
	}

	@Override
	public void call() {
		System.out.println("calling service is present");
	}

	@Override
	void netSurfing() {
		System.out.println("net surfing service is present");
	}

	@Override
	void banking() {
		System.out.println("banking service is present");
	}

	@Override
	void voiceChat() {
		System.out.println("voice chat  service is present");
	}

	@Override
	void videoChat() {
		System.out.println("video chat service is present");
	}

	public static void main(String[] args) {
     SmartPhone phone=new SmartPhone();
     phone.call();
     phone.message();
     phone.banking();
     phone.gpsTracking();;
     phone.playAudio();
     phone.videoChat();
     phone.videoPlay();;
     phone.voiceChat();
	}
}
