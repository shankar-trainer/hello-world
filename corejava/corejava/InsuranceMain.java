
public class InsuranceMain {

	public static void main(String[] args) {
		Insurance insurance1=new Insurance();
		
		insurance1.insuranceInformation();
		
		insurance1.insuranceId=99898;
		insurance1.insuranceName="car insurance";
		insurance1.insuranceMaturityTime=9;

		insurance1.insuranceInformation();
		
		
	}
}
