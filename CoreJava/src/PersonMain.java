
public class PersonMain {

	public static void main(String[] args) {
		
		Person person1=new Person();
		
		Person person2=new Person(10006,"parmod kumar",45000);
		Person person3=new Person(10007,"arvind kumar",56000);
		Person person4=new Person(10008,"lalan kumar",78000);
		Person person5=person4;
		
		
		person1.personInfo();
		person2.personInfo();
		person3.personInfo();
		
		person4.personInfo();
		person5.personInfo();
		
	}
}
