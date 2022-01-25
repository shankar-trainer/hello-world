
public class Months {

	public static final int Jan = 1;
	public static final int Feb = 2;
	public static final int Mar = 3;
	public static final int April = 4;
}

interface userMonth {
	int Jan = 1;
	int Feb = 2;
	int Mar = 3;
	int April = 4;

}

class Kids{
	
	public static void main(String[] args) {
		System.out.println("Month "+userMonth.Jan);
	}
}