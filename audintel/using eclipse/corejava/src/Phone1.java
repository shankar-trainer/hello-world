public interface Phone1 {
	String country = "India";
	public static final String state = "India";
	// no instance variable only public static final variable
	void call();
}

interface BasicPhone extends Phone1 {
	void message();
}

interface BasicMobile extends Phone1, BasicPhone {
	void playMusic();
}

interface SmartPhone extends Phone1, BasicPhone, BasicMobile {
	void chatApp();

	void netSurfing();

	void bankApplication();

	void emailApp();

	void gaming();

	void videoPlay();
}
