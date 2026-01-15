public class Insurance {

	int insuranceId;
	String  insuranceName;
	int insuranceMaturityTime;
	
	public Insurance() {
		System.out.println("default constructor ");
	     this.insuranceId=10001;
	     this.insuranceName="Life Insurance";
	     this.insuranceMaturityTime=5;
	}
	
	public Insurance(int insuranceId, String insuranceName, int insuranceMaturityTime) {
		System.out.println("overloaded constructor ");
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceMaturityTime = insuranceMaturityTime;
	}

	void insuranceInformation(){
		System.out.println("Insurance data ");
		System.out.println("\t id :"+insuranceId);
		System.out.println("\t name :"+insuranceName);
		System.out.println("\t maturity time :"+insuranceMaturityTime);
	}
	
	
	public static void main(String[] args) {
		Insurance insurance1=new Insurance();
		Insurance insurance2=new Insurance(90001,"child insurance",20);
		Insurance insurance3=new Insurance(90002,"health insurance",4);
				
		insurance1.insuranceInformation();
		insurance2.insuranceInformation();
		insurance3.insuranceInformation();
	}
	
}
