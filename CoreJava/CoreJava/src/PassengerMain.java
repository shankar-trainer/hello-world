
public class PassengerMain {

	  public static void main(String[] args) {
		
		  Passenger passenger[]=new Passenger[3];
		  
		  passenger[0]=new Passenger();
		  
		  passenger[0].setPassengerId(188789);
		  passenger[0].setPassengerName("sashi k");
		  passenger[0].setPassengerAge(25);
	
		  passenger[1]=new Passenger();
		  
		  passenger[1].setPassengerId(188781);
		  passenger[1].setPassengerName("amar kumar");
		  passenger[1].setPassengerAge(33);
		  
		  passenger[2]=new Passenger();
		  
		  passenger[2].setPassengerId(188780);
		  passenger[2].setPassengerName("pushpa");
		  passenger[2].setPassengerAge(21);
		  
		  for(Passenger p:passenger)
			  System.out.println(p.getPassengerId()+"  "+p.getPassengerName()+"  "+p.getPassengerAge());
		  
		  
	}
}
