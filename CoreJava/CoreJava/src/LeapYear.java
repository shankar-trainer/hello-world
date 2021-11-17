import java.util.Scanner;

public class LeapYear {

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && ((year % 400 != 0) || (year % 100 != 0)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int year = new Scanner(System.in).nextInt();
		System.out.println(year + "  Leap Year " + isLeapYear(year));
	}
}
