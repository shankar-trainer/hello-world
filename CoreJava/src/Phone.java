public interface Phone {
	// void call(); // all methods are public and abstract
	public  abstract void call();
    //String country;
     // all variables are public static and final 
  public static final	String country="india";
}

interface basicPhone extends Phone {
	void call();
	void message();
}
// basicMobile -- two super class
interface basicMobile extends Phone, basicPhone {
	void playAudio();
	void playVideo();
}

class SmartPhone implements Phone, basicPhone, basicMobile {
	void netaccess() {
		System.out.println("internet access ");
	}
	@Override
	public void message() {
		System.out.println("can send message");
	}
	@Override
	public void call() {
		System.out.println("Can call ");
	}

	@Override
	public void playAudio() {
		System.out.println("play audio");
	}

	@Override
	public void playVideo() {
		System.out.println("play video");
	}
}