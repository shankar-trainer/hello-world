import java.text.DateFormat;
import java.util.Date;

public class datePrg2 {

	public static void main(String[] args) {
		Date date=new Date();
		
		System.out.println(date);
		
		DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.LONG);
		
		String s=dateFormat.format(date);
		System.out.println("date in long format "+s);
		
		dateFormat=DateFormat.getDateInstance(DateFormat.MEDIUM);

		System.out.println("date in medium format "+dateFormat.format(date));
		
		dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("date in short format "+dateFormat.format(date));
		
	}
}
