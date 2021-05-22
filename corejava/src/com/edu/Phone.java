package com.edu;

public interface Phone {
	void call();
}

interface BasicPhone {
	void call();
	void message();
}

interface Mobile extends Phone, BasicPhone {
	void videoCall();
	void gaming();
}

class SmartPhone implements Phone, BasicPhone, Mobile {

	void info() {
		System.out.println("information about smart phone");
	}

	@Override
	public void videoCall() {
		System.out.println("video call");
	}

	@Override
	public void gaming() {
		System.out.println("gaming");
	}

	@Override
	public void message() {
		System.out.println("messaging");

	}

	@Override
	public void call() {
		System.out.println("calling");
	}

	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
		 phone.call();
		 phone.videoCall();
		 phone.message();
		 phone.gaming();
		 phone.info();
	}
}