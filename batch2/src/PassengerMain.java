import java.util.Date;

public class PassengerMain {

	public static void main(String[] args) {
			Passenger passenger1=new Passenger();
			Passenger passenger2=new Passenger(788787,"hari parsad",45,"chennai", new Date());
			Passenger passenger3=new Passenger(788788,"gauri parsad",25,"madurai",new Date());
			Passenger passenger4=new Passenger(788789,"madurai",new Date());

			
			passenger1.passengerInfo();
			passenger2.passengerInfo();
			passenger3.passengerInfo();
			
			passenger4.passengerInfo1();

	}
}
