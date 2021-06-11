
public class Vehicle {
 
	public static void main(String[] args) {
		SportsCar scar=new SportsCar();
		if(scar instanceof SportsCar)
			System.out.println("scar instanceof SportsCar");
		
		if(scar instanceof Car)
			System.out.println("scar instanceof Car");
		
		if(scar instanceof Vehicle)
			System.out.println("scar instanceof Vehicle");
		
		
		if(scar instanceof Object)
			System.out.println("scar instanceof Object");
		
	//	if(scar instanceof Sports)
		//	System.out.println("scar instanceof Sports");
		
		
	}
}
class  Sports {
	
}
class Car extends Vehicle{
	
}

class SportsCar extends Car{}