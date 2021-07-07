public interface Phone {
	String country="india";
	//protected 
	void call();
}
interface BasicPhone {
	void call();
	void message();
}

interface BasicMobile  extends Phone,BasicPhone{
	void call();
	void message();
	void audioPlay();
	void videoPlay();
}


class SmartPhone implements Phone,BasicPhone,BasicMobile{

	@Override
	public void audioPlay() {
		System.out.println("audioplay feature");
	}

	@Override
	public void videoPlay() {
		System.out.println("videoplay feature");
	}

	@Override
	public void message() {
		System.out.println("message feature");
	}

	@Override
	public void call() {
		System.out.println("calling feature");		
	}
	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
		System.out.println("smart phone features");
		phone.audioPlay();
		phone.call();
		phone.message();
		phone.videoPlay();
		System.out.println("country is "+Phone.country);
		//Phone.country="";
	}
}

