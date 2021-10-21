
public class Person1 {

	int x=10;
	static int p=10;
	
	public Person1() {
	x++;
	p++;
	}
	
	
	
	public static void main(String[] args) {
		
		Person1 person1=new Person1();
		Person1 person2=new Person1();
		Person1 person3=new Person1();
		Person1 person4=new Person1();
	
		System.out.println(person4.x+"    "+p);
		
	}
}
