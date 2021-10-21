import java.util.Date;

public class mydate1 {

	public static void main(String[] args) {
		Date date1=new Date();
		System.out.println(date1);
		date1=new Date(1);
		System.out.println(date1);
		
		// java 7 date is mutable, it has both date and time 
		//java 8  date as immutable, 2 forms LocalDate and LocaTime
		
	}
}
