
public class Account {
	private int actId; // instance variable 
	private String actName;
	private float actSalary;
	private static String bankName = "SBI";  // class variable -- single copy is shared

	public Account(int actId, String actName, float actSalary) {
		super();
		this.actId = actId;
		this.actName = actName;
		this.actSalary = actSalary;
	}

	public int getActId() {
		return actId;
	}

	public String getActName() {
		return actName;
	}

	public float getActSalary() {
		return actSalary;
	}

	public static String getBankName() {
		return bankName;
	}

}
