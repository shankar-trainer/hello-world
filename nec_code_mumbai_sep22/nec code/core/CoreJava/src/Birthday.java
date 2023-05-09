public class Birthday {

	 private int day;
	 private  String month;
	 private int year;
	public Birthday(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}

	public String getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
        Birthday birthday=new Birthday(WeekDays.Wednesday, "January", 1990);	
        System.out.println("My Birthday is on ");
        System.out.println(birthday.getDay()+"-"+birthday.getMonth()+"-"+birthday.getYear());
	}
}
