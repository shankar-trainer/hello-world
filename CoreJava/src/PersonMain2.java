
public class PersonMain2 {

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person(7009,"parmod kumar",67000);
		Person person3 = new Person(7455,"amod kumar",89000);

		Person p4=person3;
        p4.setName("subodh kumar");
        
 		//person1.personInfo();
		//person2.personInfo();
		
        person3.personInfo();
		p4.personInfo();
	}
}
