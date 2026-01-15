
public class PerrsonMain {

	public static void main(String[] args) {
		Person person=new Person();
//		person.personId;
		person.setPersonId(878787);
		person.setPersonName("amrit kumar");
		person.setPersonLocation("chennai");
		
		System.out.println("person data ");
		System.out.println("\t id "+person.getPersonId());
		System.out.println("\t name "+person.getPersonName());
		System.out.println("\t location "+person.getPersonLocation());
		
		Person person2[]=new Person[3];// array of 3 elements 
		
//		person2[0]=new Person();
//		person2[1]=new Person();
//		person2[2]=new Person();
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		for (int i = 0; i < person2.length; i++) {
			person2[i]=new Person();  // it creates object for each element
			System.out.println("enter id name and location");
			person2[i].setPersonId(sc.nextInt());
//			person2[i].setPersonName(sc.next());
			sc.nextLine();
			
			person2[i].setPersonName(sc.nextLine());
			person2[i].setPersonLocation(sc.next());
		}

		System.out.println("all person data ");
		
		for(Person p:person2) {
			System.out.println("\n\t id :"+p.getPersonId());
			System.out.println("\t name :"+p.getPersonName());
			System.out.println("\t location :"+p.getPersonLocation());
		}
		
	}
}
