package pack3;

public interface  Phone {
	 //public static final String country;
	String country="India";
	//public abstract void call();
	void call();
}

interface basicPhone extends Phone{
    void message();	
}

interface basicMobile extends  Phone,basicPhone{
	void musicPlay();
	void radioPlay();
}

interface SmartPhone extends Phone,basicPhone,basicMobile{
	void internet();
	void game();
	void messageapp();
	void videoplay();
	void officeapp();
}

class  MyPhone {
	 private int mobileId;
	 private int mobileModel;
	 private int mobileCost;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public int getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(int mobileModel) {
		this.mobileModel = mobileModel;
	}
	public int getMobileCost() {
		return mobileCost;
	}
	public void setMobileCost(int mobileCost) {
		this.mobileCost = mobileCost;
	}
}