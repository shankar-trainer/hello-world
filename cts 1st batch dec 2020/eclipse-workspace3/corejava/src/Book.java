
public class Book {
	
	private int isbn;
	private String bname;

	public int getIsbn() {
		return isbn;
	}

	public String getBname() {
		return bname;
	}

      private	Book() {
		isbn = 9897978;
		bname = "java beginner";
		System.out.println("constructor called");
	}

	public static void main(String[] args) {

		Book b1 = new Book();

		System.out.println(b1.isbn);
		System.out.println(b1.bname);
	}
}
