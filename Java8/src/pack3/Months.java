package pack3;

interface Month {
	int January = 1;
	int February = 2;
	int March = 3;
	int April = 4;
	int May = 5;
	int June = 6;
	int July = 7;
	int August = 8;
	int September = 9;
	int October = 10;
	int November = 11;
	int December = 12;
}

public class Months {

	public static final int January = 1;
	public static final int February = 2;
	public static final int March = 3;
	public static final int April = 4;
	public static final int May = 5;
	public static final int June = 6;
	public static final int July = 7;
	public static final int August = 8;
	public static final int September = 9;
	public static final int October = 10;
	public static final int November = 11;
	public static final int December = 12;

}

class BirthDay {
	int day;
	int month;
	int year;

	public static void main(String[] args) {
		BirthDay birthDay = new BirthDay();
		birthDay.day = 11;
		birthDay.month = Months.April;
		birthDay.year = 1988;
		
		
		BirthDay birthDay1 = new BirthDay();
		birthDay1.day = 11;
		birthDay1.month = Month.April;
		birthDay1.year = 1988;
	
	}

}