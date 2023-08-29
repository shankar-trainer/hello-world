package corejava;

public abstract  class UserPhone {
	private int phoneId;
	private String phoneModel;
	private float phoneCost;

	public UserPhone(int phoneId, String phoneModel, float phoneCost) {
		super();
		this.phoneId = phoneId;
		this.phoneModel = phoneModel;
		this.phoneCost = phoneCost;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public float getPhoneCost() {
		return phoneCost;
	}
   
	public  abstract void userPhoneInfo();
}
