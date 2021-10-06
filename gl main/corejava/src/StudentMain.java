
public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		
		Birthday birthday=new Birthday();
		
		student.setRoll(1001);
		student.setName("mahesh kumar");
		
		birthday.setDay(12);
		birthday.setMonth(3);
		birthday.setYear(2011);
		
		student.setBirthday(birthday);

		System.out.println("Student Information");
		System.out.println("\troll "+student.getRoll());
		System.out.println("\tname "+student.getName());
		System.out.println("\tBirthday ");
		
		Birthday bday=student.getBirthday();
		
		System.out.println("\t\tday"+bday.getDay());
		System.out.println("\t\tmonth"+bday.getMonth());
		System.out.println("\t\tyear"+student.getBirthday().getYear());
	}
}
