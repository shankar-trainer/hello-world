public class Author {
// super, parent class
	int id;
	String name;
	int age;

	void authorInfo() {
		System.out.println("author data ");
		System.out.println("\t id :" + id);
		System.out.println("\t name :" + name);
		System.out.println("\t age :" + age);
	}
}
class NovelAuthor extends Author {

	// NovelAuthor is Author
	// is a relationship 
	// child class
	
	String location;
	String bookName;
		
	public static void main(String[] args) {
     NovelAuthor novelAuthor=new NovelAuthor();
     novelAuthor.id=90990;
     novelAuthor.name="ram charan shukla";
     novelAuthor.age=55;
     novelAuthor.location="allahabad";
     novelAuthor.bookName="basant ke phool";
     
     novelAuthor.authorInfo();
     System.out.println("\tlocation "+novelAuthor.location);
     System.out.println("\tbookName "+novelAuthor.bookName);
	}
}
