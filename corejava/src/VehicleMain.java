
public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle("RJ 65656", "activa scooty", "2 wheeler",12000 );
		
		System.out.println("Data of veihcle");
		
		System.out.println("\tNo   "+vehicle.getVehicleNumber());
		System.out.println("\tModel  "+vehicle.getModelName());
		System.out.println("\tCost "+vehicle.getPrice());
		System.out.println("\tType "+vehicle.getVehicleType());
		
		
		System.out.println("\tLoan Amount "+vehicle.issueLoan());
		System.out.println("\tInsurance Amount "+vehicle.takeInsurance());
		
		
		System.out.println(vehicle instanceof Vehicle);
		System.out.println(vehicle instanceof Object);
		System.out.println(vehicle instanceof Loan);
		System.out.println(vehicle instanceof Insurance);
		
		//System.out.println(vehicle instanceof Employee);
	}
}
