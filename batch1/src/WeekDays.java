import java.util.Scanner;

public interface WeekDays {
 int Monday=1;
 int Tuesday=2;
 int Wednesday=3;
 int Thursday=4;
 int Friday=5;
 int Saturday=6;
 int Sunday=7;
}


class Birthday{
	
	public static void main(String[] args) {
		System.out.println("Enter week day in 1 to 7");
		int x=new Scanner(System.in).nextInt();
		
		switch (x) {
		case 1:
			System.out.println(WeekDays.Monday);
			break;
		case 2:
			System.out.println(WeekDays.Tuesday);
			break;
		case 3:
			System.out.println(WeekDays.Wednesday);
			break;
		case 4:
			System.out.println(WeekDays.Thursday);
			break;
		case 5:
			System.out.println(WeekDays.Friday);
			break;
		case 6:
			System.out.println(WeekDays.Saturday);
			break;
		case 7:
			System.out.println(WeekDays.Sunday);
			break;

		default:
			break;
		}
	
	}
}