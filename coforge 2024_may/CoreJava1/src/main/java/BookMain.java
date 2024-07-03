
public class BookMain {

	public static void main(String[] args) {
		Book book=new Book(1,"c data structure","ram kumar",2300);
		//book.isbn=-8887;
		//book.author="";
		//book.cost=0;
		
		book.setIsbn(100001);
		book.setAuthor("p kumar");
		book.setBname("java programming");
		book.setCost(1200);
		
		System.out.println("book data ");
		System.out.println("\tisbn :"+book.getIsbn());
		System.out.println("\tname :"+book.getBname());
		System.out.println("\tauthor :"+book.getAuthor());
		System.out.println("\tcost :"+book.getCost());
	}
}
