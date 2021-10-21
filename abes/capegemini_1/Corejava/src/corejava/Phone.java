package corejava;

public interface Phone {
	String country = "india";
	// void call(){}
	public abstract void call();
}

interface basicPhone extends Phone {
	void message();
}

interface SmartPhone extends Phone, basicPhone {
	void internet();

	void videoCall();
}