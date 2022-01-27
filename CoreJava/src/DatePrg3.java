import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrg3 {

	public static void main(String[] args) {
		Date date=new Date();
		
		
		DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("dd-MMMM-yyyy  EEEE G Z");
		System.out.println(dateFormat.format(date));
		
		dateFormat=new SimpleDateFormat("hh:mm:ss a");
		System.out.println(dateFormat.format(date));
		
		
	}
}
