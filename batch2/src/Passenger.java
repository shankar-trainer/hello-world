import java.util.Date;

public class Passenger {

	private int passengerId;
	private String passengerName;
	private int passengerAge;
	private String location;
	private Date journeyDate;
	
	public Passenger() {
		passengerAge = 34;
		passengerId = 565665;
		passengerName = "saurabh kumar";
		journeyDate=new Date();
		location="delhi";
		System.out.println("default contructor called ");
	}

	public Passenger(int passengerId, String passengerName, int passengerAge,String location, Date journeyDate) {
		this(passengerId,passengerName,journeyDate);
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
	}
	
	public Passenger(int passengerId, String location, Date journeyDate) {
		this.passengerId = passengerId;
		this.location = location;
		this.journeyDate = journeyDate;
	}
	


	public String getLocation() {
		return location;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	
	public int getPassengerId() {
		return passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void passengerInfo() {
		System.out.println("\nPassenger Information");
		System.out.println("id is " + getPassengerId());
		System.out.println("name is " + getPassengerName());
		System.out.println("age is " + getPassengerAge());
		System.out.println("journey date  is " + getJourneyDate());
		System.out.println("location date  is " + getLocation());
	}
	
	public void passengerInfo1() {
		System.out.println("\nPassenger Information");
		System.out.println("id is " + getPassengerId());
		System.out.println("location date  is " + getLocation());
		System.out.println("journey date  is " + getJourneyDate());
	}
	

	public static void main(String[] args) {
//		Passenger passenger1 = new Passenger();
//		Passenger passenger2 = new Passenger(788787, "hari parsad", 45);
//		Passenger passenger3 = new Passenger(788788, "gauri parsad", 25);
//		Passenger passenger4 = new Passenger(788789, "hema parsad", 40);
//
//		System.out.println(passenger1.passengerId);
//		System.out.println(passenger1.passengerName);
//		System.out.println(passenger1.passengerAge);
//
//		System.out.println(passenger2.passengerId);
//		System.out.println(passenger2.passengerName);
//		System.out.println(passenger2.passengerAge);
//
//		System.out.println(passenger3.passengerId);
//		System.out.println(passenger3.passengerName);
//		System.out.println(passenger3.passengerAge);
//
//		System.out.println(passenger4.passengerId);
//		System.out.println(passenger4.passengerName);
//		System.out.println(passenger4.passengerAge);
//
	}
}
