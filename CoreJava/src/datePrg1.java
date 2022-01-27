import java.util.Date;

public class datePrg1 {

	public static void main(String[] args) {
		
		Date date=new Date();
		Date date5=new Date();
		System.out.println(date);
		System.out.println(date.equals(date5));
		
		System.out.println(date.compareTo(date5));
		
		Date date2=new Date(1000);
		
		System.out.println(date2);
		
		Date date3=new Date(1000*60*60*24);
		
		System.out.println(date3);
		
		Date date4=new Date(1000L*60L*60L*24L*365L*10);
		
		System.out.println(date4);
		
		System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		
		System.out.println(date.getDate()+"/"+(date.getMonth()+1)+"/"+(date.getYear()+1900));
		
		System.out.println(date.after(date2));
		System.out.println(date.compareTo(date2));
		
		System.out.println(date.before(date2));
		
		
	}
}
