
public class BookMain {

	public static void main(String[] args) {
		
		Book book[]=new Book[4];
		
		// array of 4 book 
		
		book[0]=new Book();
		book[1]=new Book(676767,  "premchand story","literature", 1200);
		book[2]=new Book(676768,  "history of india","history", 650);
		book[3]=new Book(676769, "physics by a kumar", "science", 300);
		
		for (Book book2 : book) {
			book2.bookInfo();
		}
		
		//System.out.println("total cost of all books "+Book.totalCost(book));
		System.out.println("total cost of all books "+book[0].totalCost(book));
	}
}
