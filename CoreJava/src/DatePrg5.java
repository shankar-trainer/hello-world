import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatePrg5 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.HOUR)+":"+(calendar.get(Calendar.MINUTE)+1)+":"+calendar.get(Calendar.SECOND));
	
		calendar.add(Calendar.HOUR, 30);
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		
		System.out.println(calendar.get(Calendar.HOUR)+":"+(calendar.get(Calendar.MINUTE)+1)+":"+calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+"/"+(calendar.get(Calendar.MONTH)+1)+"/"+calendar.get(Calendar.YEAR));

		
		GregorianCalendar calendar2=new GregorianCalendar(2019, 9, 10, 10, 44, 55);
		
		System.out.println(calendar2.get(Calendar.HOUR)+":"+(calendar2.get(Calendar.MINUTE)+1)+":"+calendar2.get(Calendar.SECOND));
		System.out.println(calendar2.get(Calendar.DAY_OF_MONTH)+"/"+(calendar2.get(Calendar.MONTH)+1)+"/"+calendar2.get(Calendar.YEAR));

		
	}
}
