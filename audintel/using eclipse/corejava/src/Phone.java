
public class Phone {

	private long phoneId;
	private long phoneNo;
	private String phoneType;
	private String phoneModel;
	private float phoneCost;

	public Phone(long phoneId, long phoneNo, String phoneType, String phoneModel, float phoneCost) {
		super();
		this.phoneId = phoneId;
		this.phoneNo = phoneNo;
		this.phoneType = phoneType;
		this.phoneModel = phoneModel;
		this.phoneCost = phoneCost;
	}

	public long getPhoneId() {
		return phoneId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public float getPhoneCost() {
		return phoneCost;
	}

}
