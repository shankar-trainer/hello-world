package corejava;

public interface Phone {

	public abstract void call();
//  void call(); // all methods are public and abstract
	// String os="android"; // all variables are public static and final

	public static final String os = "android";
}

interface BasicMobilePhone {
	void call();

	void message();
}

// multiple inheritance
interface SmartPhone extends Phone, BasicMobilePhone {
	void playVideo();

	void internetSurfing();

	void internetGaming();

	void internetBanking();

	void internetCall();
}
