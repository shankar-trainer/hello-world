
public class Train {

	private int trainNo; // instance variable
	private String trainName; // instance variable
	private static String country; // static variable
	static int count;

	public Train() {
		trainName = "vaishali express";
		trainNo = 766767;
		System.out.println("constructor called");
		count++;
	}

	static {
		country = "india";
		System.out.println("static block called ");
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Train.country = country;
	}

	public static void trainInfo(Train t) {
		System.out.println("train no " + t.trainNo);
		System.out.println("train name " + t.trainName);
		System.out.println("country name  " + country);
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

}
