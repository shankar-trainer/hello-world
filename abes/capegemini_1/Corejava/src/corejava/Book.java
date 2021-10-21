package corejava;
public class Book {
	private int isbn;
	private String name;
	private float cost;
	private float offer;

	public Book(int isbn, String name, float cost, float offer) {
		this.isbn = isbn;
		this.name = name;
		this.cost = cost;
		this.offer=offer;
	}
	void bookInfo(){
		System.out.println("Book ionformation"  );
		System.out.println("isbn "+isbn);
		System.out.println("name "+name);
		System.out.println("actual cost "+cost);
System.out.println("final cost after offer "+(cost-(cost*offer)));
	}
}
class ComputerBook extends Book{
  public ComputerBook(int isbn, String name, float cost) {
    super(isbn,name,cost,0.08f);
  }

  public static void main(String[] args) {
	ComputerBook book=new ComputerBook
			(76576,"beginning java 7", 789.56f);
	book.bookInfo();
}
}