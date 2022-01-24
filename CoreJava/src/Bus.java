public class Bus extends Vehicle {

	private float fare_rebate;

	public float getFare_rebate() {
		return fare_rebate;
	}

	public void setFare_rebate(float fare_rebate) {
		this.fare_rebate = fare_rebate;
	}
	
	@Override
	public float getFare() {
		System.out.println("Total fare is "+super.getFare());
		return super.getFare()- super.getFare()*getFare_rebate();
	}
	
	public static void main(String[] args) {
		 Bus bus=new Bus();
		 bus.setModel("classic");
		 bus.setCost(4000000);
		 bus.setFare(1500);
		 bus.setFare_rebate(0.1f);
		 bus.setRegNo(87877887);
		 
		 System.out.println("Bus Information ");
		 System.out.println("Reg no "+bus.getRegNo());
		 System.out.println("Model no "+bus.getModel());
		 System.out.println("Cost no "+bus.getCost());
		 System.out.println("Fare Rebate  "+bus.getFare_rebate()+" %");
		 System.out.println("Fare after rebate is  "+bus.getFare());
	}

}
