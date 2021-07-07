
public class BookMain {

	public static void main(String[] args) {
		Book book=new Book("java programming", "sumesh kumar" );
		
		Book book2=new Book(677676, "core java beginner", 876, "Bala guruswami");
		
		System.out.println("book1 Information");
		System.out.println("isbn "+book.getIsbn());
		System.out.println("book name "+book.getBname());
		System.out.println("author  "+book.getAuthor());
		System.out.println("cost "+book.getCost());
		
		System.out.println("\nbook2 Information");
		
		System.out.println("isbn "+book2.getIsbn());
		System.out.println("book name "+book2.getBname());
		System.out.println("author "+book2.getAuthor());
		System.out.println("cost "+book2.getCost());
		
	}
}
