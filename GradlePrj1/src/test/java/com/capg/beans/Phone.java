package com.capg.beans;

public interface Phone {
	void call(); // method are public and abstract by default
//	String    country;// error 
	String    country="india"; 
	// variables are public static and final by default
	
	//Phone(){	}// no constructor is allowed
}

interface BasicPhone extends Phone {
	void message();
}

// multiple inheritance one subclass has multiple super class
interface basicMobile extends Phone, BasicPhone {
	void playAudio();
}

abstract class AndroidPhone {

	abstract void netSurfing();
	abstract void banking();
	abstract void voiceChat();
	abstract void videoChat();

	void gpsTracking() {
		System.out.println("gps facility is present");
	}

	void videoPlay() {
		System.out.println("video playing service is present");
	}
}