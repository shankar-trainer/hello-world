
public class BookTest {

	public static void main(String[] args) {
		Book book1=new Book(655656, "let us c","yaswant kanitkar", 500.0f, 5.0f);
		Book book2=new Book(655657, "let us java","bala guruswamy", 700.0f, 5.6f);
		Book book3=new Book(655659, "java in action","marks jew", 1700.0f, 8.20f);
		
		
		Book.bookInfo(book1);
		Book.bookInfo(book2);
		Book.setCountry("united state of america");
		Book.bookInfo(book3);
		
		System.out.println(Math.PI);
		
		
		
	}
}
