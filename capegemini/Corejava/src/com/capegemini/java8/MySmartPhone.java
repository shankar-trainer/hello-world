package com.capegemini.java8;

public class MySmartPhone {
	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone() {
			@Override
			public void videocall() {
				System.out.println("video call facility");
			}
			@Override
			public void message() {
				System.out.println("message facility");
			}
			@Override
			public void call() {
				System.out.println("call facility");
			}
		};
		
		phone.call();
		phone.message();
		phone.videocall();
		System.out.println("country "+SmartPhone.country);
		System.out.println("model "+SmartPhone.model);
	}

}
