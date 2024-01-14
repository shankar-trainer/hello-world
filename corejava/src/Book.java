/**
 * <b><i>Book class</i></b>
 * <p>
 * Book class contains information about <br>Book details
 *  
 */

public class Book {

	int isbn;
	String bname;
	String btype;
	float cost;
	String country;

	/**
	 *<b>bookInfo</b>
	 *<p>
	 *bookInfo prints all attribute 
	 * <br>values 
	 */
	void bookInfo() {
		System.out.println(" book information");
		System.out.println("\tisbn "+isbn);
		System.out.println("\tname "+bname);
		System.out.println("\ttype "+btype);
		System.out.println("\tcost "+cost);
		System.out.println("\tcountry  "+country);
	}

	public Book() {
		this("nepal");
		this.isbn = 7887887;
		this.bname = "java beginner";
		this.btype = "computer";
		this.cost = 700;
	}

	public Book(int isbn, String bname, String btype, float cost) {
		this("india");
		this.isbn = isbn;
		this.bname = bname;
		this.btype = btype;
		this.cost = cost;
	}
	
	//static
	float totalCost(Book b[]) {
		float total=0;
		for (Book book : b) {
			total=total+book.cost;
		}
		return total;
	}
	
//	float[] min_maxCost(Book b[]) {
//		
//	}

	public Book(String country) {
		super();
		this.country = country;
	}
}
