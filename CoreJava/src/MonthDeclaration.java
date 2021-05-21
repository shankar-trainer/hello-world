import java.util.Scanner;

public class MonthDeclaration {

	public static final int    January=1;
	public static final int    February=2;
	public static final int    March=3;
	public static final int    April=4;
	
}

 interface Month{
	 int January=1;
	 int February=2;
	 int March=3;
	 int April=4;
 }
 
 
 class Birthday{
	 
	 public static void main(String[] args) {
		System.out.println("select the month ");
		System.out.println(Month.January);
		System.out.println(Month.February);
		System.out.println(Month.March);
		System.out.println(Month.April);
	  
		Scanner scanner=new Scanner(System.in);
	    int month=scanner.nextInt();
	    
	 }
 }