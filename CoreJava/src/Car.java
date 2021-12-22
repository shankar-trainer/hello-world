class Bus1{
	
}
class Vehicle{
	
}
public class Car extends Vehicle {

	public static void main(String[] args) {
		Car car=new Car();
		
		if(car instanceof Car)
			System.out.println("car is instance of Car ");
		
		if(car instanceof Vehicle)
			System.out.println("car is instance of Vehicle ");
		
		if(car instanceof Object)
			System.out.println("car is instance of Object ");
	
		//if(car instanceof Bus1)  // compiler error  
			//System.out.println("car is instance of Object ");
		
		
	}
	
}
