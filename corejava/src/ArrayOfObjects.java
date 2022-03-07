class Book{
	private int isbn;
	private  String bname;
	private float cost;
	private String author;
	public Book(int isbn, String bname, float cost, String author) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.cost = cost;
		this.author = author;
	}
	
	public void bookInfo() {
		System.out.println("\nBook Record");
		System.out.println("isbn "+isbn);
		System.out.println("name "+bname);
		System.out.println("cost "+cost);
	   System.out.println("author "+author);
	}
}


public class ArrayOfObjects {

	public static void main(String[] args) {
	     int isbn1[]= {100003,10002,10001};
	     String author1[]= {"amrish kumar","abhishek kumar","dhirendra sharma"};
	     String bname1[]= {"java in action","java for dummies","java professional"};
	     float cost1[]= {1200,15000,700};
		
		Book book[]=new Book[3];// array of 3 book elements  
      // array --create by  []
		// object  created by  ()
   		for (int i = 0; i < book.length; i++) {
	         book[i]=new Book(isbn1[i],bname1[i] , cost1[i], author1[i]);  // object creation		
		}
		
   		System.out.println("Books are ");
   		
   		for (Book book2 : book) {
			book2.bookInfo();
		}
	}
}
