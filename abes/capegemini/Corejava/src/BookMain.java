import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Book book[]=new Book[3]; // array creation
		Scanner scanner=new Scanner(System.in);
		int isbn;
		String book_name;
		float cost;
		String author;
				
		for (int i = 0; i < book.length; i++) {
		 System.out.println("Enter book isbn name cost author");	
		 isbn=scanner.nextInt();
		 book_name=scanner.next();
		 cost=scanner.nextFloat();
		 scanner.nextLine();
		 author=scanner.nextLine();
		 
		 book[i]=new Book(isbn, book_name, cost, author);
		      // above object creation
		}
		
		System.out.println();
		
		for (Book book2 : book) {
			book2.bookInfo();
		}
		
		
	}
}
