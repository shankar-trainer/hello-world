public interface Phone {
	void call();
}

interface BasicPhone {
	void call();

	void message();
}

interface BasicMobile {
	void call();

	void message();

	void playSong();

	void playRadio();
}

class SmartPhone implements Phone, BasicMobile, BasicPhone {

	@Override
	public void message() {
		System.out.println("send message");
	}

	@Override
	public void playSong() {
		System.out.println("Play audio song");
	}

	@Override
	public void playRadio() {
		System.out.println("play radio");
	}

	@Override
	public void call() {
		System.out.println("call to other");
	}
public static void main(String[] args) {
	SmartPhone phone=new SmartPhone();
	phone.call();
	phone.message();
	phone.playRadio();
	phone.playSong();

}
}