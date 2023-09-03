
public interface Phone {
	String country = "India";

//public static final 	String country;
	void call();
	// public abstract void call();
}

interface Mobile {
	void message();
}

// MyBasicMobile has 2 super class  Phone, Mobile 
// multiple inheritance feature
interface MyBasicMobile extends Phone, Mobile {
	void playMusic();
}

abstract class UserPhone  {
	int id;
	float cost;
	String model;

	public UserPhone(int id, float cost, String model) {
		super();
		this.id = id;
		this.cost = cost;
		this.model = model;
	}
}