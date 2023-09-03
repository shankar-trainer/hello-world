
public class Author {

	private int authorId;
	private String authorName;

//	private final String country="India";
	private final String country;

	public Author()// error blank final not initialized
	{
		country = "india";
		authorName = "pankaj kumar";
		authorId = 7655676;
	}
	public static void main(String[] args) {
		Author author = new Author();
		System.out.println("Author data");
		//author.country = "nepal";  // error 
		System.out.println("Id is " + author.authorId);
		System.out.println("Name is " + author.authorName);
		System.out.println("Country  is " + author.country);
	}
}
