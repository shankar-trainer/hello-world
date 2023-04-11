class Vehicle {

}

public class Bus extends Vehicle {
	public static void main(String[] args) {
      
		Bus bus=new Bus();
		
		System.out.println(bus instanceof Bus);
		System.out.println(bus instanceof Vehicle);
		System.out.println(bus instanceof Object);
	}

}
