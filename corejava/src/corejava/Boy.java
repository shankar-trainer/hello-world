package corejava;

public class Boy {
	private int boyId;
	private String boyName;
	private int boyAge;
	private int boyBirthday;

	public Boy(int boyId, String boyName, int boyAge, int boyBirthday) {
		super();
		this.boyId = boyId;
		this.boyName = boyName;
		this.boyAge = boyAge;
		this.boyBirthday = boyBirthday;
	}
	@Override
	public String toString() {
		return "Boy [boyId=" + boyId + ", boyName=" + boyName + ", boyAge=" + boyAge + ", boyBirthday=" + boyBirthday
				+ "]";
	}
}
