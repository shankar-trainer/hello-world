
public class Car {

}
class racingCar extends Car{
	
}

class Main{
	
	public static void main(String[] args) {
		
		racingCar car=new racingCar();
		System.out.println(car instanceof racingCar);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Object);
		//System.out.println(car instanceof Vehicle);
		
	}
}