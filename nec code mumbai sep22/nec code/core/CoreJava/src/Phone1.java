
public interface Phone1 {
	// public abstract
	void call();
}

interface HomePhone {
	void message();
}

interface Mobile extends Phone1, HomePhone {
	void playMusic();
	void bluetooth();
}

interface SmartPhone extends Phone1, HomePhone, Mobile {
	// public static final
	String country="India";
	void videoPlay();
	void touchScreen();
	void netSurfing();
	void appFeature();
}

class UserPhone {
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	private int phoneId;
	private float cost;
	private String Model;

}
