package corejava;

class MyPhone implements Phone, basicPhone, SmartPhone {

	@Override
	public void internet() {
		System.out.println("internet surfing allowed");
	}

	@Override
	public void videoCall() {
		System.out.println("videoCall allowed");
	}

	@Override
	public void message() {
		System.out.println("message allowed");
	}

	@Override
	public void call() {
		System.out.println("calling allowed");
	}
	public static void main(String[] args) {
	  MyPhone myPhone=new MyPhone();
	  //MyPhone.country="china";
	  myPhone.call();
	  myPhone.message();;
	  myPhone.videoCall();
	  System.out.println("Country is "+MyPhone.country);
	}
}