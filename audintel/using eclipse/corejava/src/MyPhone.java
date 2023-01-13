abstract class MyPhone{
	protected int phoneId;
	protected String  phoneModel;
	protected float phonePrice;
	public MyPhone(int phoneId, String phoneModel, float phonePrice) {
		super();
		this.phoneId = phoneId;
		this.phoneModel = phoneModel;
		this.phonePrice = phonePrice;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	public float getPhonePrice() {
		return phonePrice;
	}
	public void setPhonePrice(float phonePrice) {
		this.phonePrice = phonePrice;
	}
	@Override
	public String toString() {
		return "MyPhone [phoneId=" + phoneId + ", phoneModel=" + phoneModel + ", phonePrice=" + phonePrice + "]";
	}
      	
}