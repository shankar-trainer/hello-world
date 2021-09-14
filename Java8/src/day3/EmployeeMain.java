
public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Employee employee=new Employee();
		
		employee.setEmpId(67676788);
		employee.setEmpName("suryakant nirala");
		employee.setEmpsalary(34000);
		
		Address address=new Address();
		
		address.setCity("muradabad");
		address.setStreet("sector1");
		address.setState("UP");
		address.setPin(6777667);
		
		employee.setAddress(address);
		
		Car car[]=new Car[3];
		
		car[0]=new Car();
		car[0].setCarRegNo("AP 78878");
		car[0].setCarModel("Maruti swift");
		car[0].setCarCost(600000.00f);
		
		car[1]=new Car();
		car[1].setCarRegNo("UP 76766");
		car[1].setCarModel("Maruti 800");
		car[1].setCarCost(300000.00f);
		
		car[2]=new Car();
		car[2].setCarRegNo("TN  18478");
		car[2].setCarModel("Swift Desire");
		car[2].setCarCost(800000.00f);
		
		employee.setCars(car);
		
		System.out.println("Employee information");
		
		System.out.println("\tid is "+employee.getEmpId());
		System.out.println("\tname is "+employee.getEmpName());
		System.out.println("\tsalary is "+employee.getEmpsalary());
		
		System.out.println("\nAddress ");
		
		System.out.println("\tstreet is "+employee.getAddress().getStreet());
		System.out.println("\tcity is "+employee.getAddress().getCity());
		
		Address address2 = employee.getAddress();
		
		System.out.println("\tpin is "+address2.getPin());
		System.out.println("\tstate is "+address2.getState());
		
		Car car2[]=employee.getCars();
		System.out.println("\nEmployee Cars are ");
		
		for (Car car3 : car2) {
			System.out.println("\n\tReg no "+car3.getCarRegNo());
			System.out.println("\tModel "+car3.getCarModel());
			System.out.println("\tCost "+car3.getCarCost());
		}
	}
}
