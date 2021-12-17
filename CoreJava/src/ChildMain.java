
public class ChildMain {

	public static void main(String[] args) {
		Child child=new Child();
		
		Birthday birthday=new Birthday();
		
		child.setId(1);
		child.setName("kamal");;
		child.setAge(4);
		
		birthday.setDay(12);
		birthday.setMonth(8);
		birthday.setYear(2017);
		
		
		child.setBday(birthday);
		
		System.out.println("Child Details ");
		System.out.println("\tid is "+child.getId());
		System.out.println("\tname is "+child.getName());
		System.out.println("\tage is "+child.getAge());
		
		System.out.println("\nBirthday");
		
		Birthday birthday2=child.getBday();
		
		System.out.println("\tday"+birthday2.getDay());
		System.out.println("\tmonth"+birthday2.getMonth());
		System.out.println("\tyear"+birthday2.getYear());
		System.out.println("\tyear"+child.getBday().getYear());
	}
}
