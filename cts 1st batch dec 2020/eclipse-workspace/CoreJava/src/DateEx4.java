import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx4 {

	public static void main(String[] args) {
		
		LocalDateTime dateTime=LocalDateTime.now();

		
		System.out.println(dateTime);
		
		System.out.println("day of week "+dateTime.getDayOfWeek());
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
		
		System.out.println(formatter.format(dateTime));
		
		
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE");
		
	String s=	formatter1.format(dateTime);
	String s2=	dateTime.format(formatter1);
	System.out.println("two dates are "+s+"  "+s2);
	
	String[] split = s.split("-");
	
	String s1="";
		
	int x=0;
	for (String string : split) {
		 if(x==0)
				s1=s1+string+"rd"+"-";
		 else if(x==2)
			 s1=s1+string;
		 else
			 s1=s1+string+"-";
		 x++;
	}
	
	System.out.println(s1);
		
		
	}
}
